package org.guanzon.clients;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.appdriver.base.MiscUtil;
import org.guanzon.appdriver.base.SQLUtil;
import org.guanzon.appdriver.constant.EditMode;
import org.guanzon.appdriver.constant.RecordStatus;
import org.guanzon.appdriver.iface.GEntity;
import org.json.simple.JSONObject;


/**
 *
 * @author Michael Cuison
 */
public class Model_Client_Mail implements GEntity{
    
    final String XML = "Model_Client_Mail.xml";
    Connection poConn;          //connection
    CachedRowSet poEntity;      //rowset
    String psMessage;           //warning, success or error message
    
    
    GRider poGRider;
    int pnEditMode;
    public JSONObject poJSON;
    
    public Model_Client_Mail(Connection foValue, GRider poValue){
        if (foValue == null){
            System.err.println("Database connection is not set.");
            System.exit(1);
        }
        pnEditMode = EditMode.UNKNOWN;
        poGRider = poValue;
        poConn = foValue;
        
        initialize();
    }

    
        @Override
    public String getColumn(int fnCol) {
        try {
            return poEntity.getMetaData().getColumnLabel(fnCol); 
        } catch (SQLException e) {
        }
        return "";
    }

    @Override
    public int getColumn(String fsCol) {
        try {
            return MiscUtil.getColumnIndex(poEntity, fsCol);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /** 
     * this is your table name
     **/
    @Override
    public String getTable() {
        return "Client_eMail_Address";
    }
     @Override
    public void list() {
        Method[] methods = this.getClass().getMethods();
        
        System.out.println("List of public methods for class " + this.getClass().getName() + ":");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
    /**
     * Sets the Owner ID of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setClientID(String fsValue){
        return setValue("sClientID", fsValue);
    }
    
    /**
     * @return The Owner ID of this record. 
     */
    public String getClientID(){
        return (String) getValue("sClientID");
    }
    
    /**
     * Sets the Entry no.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setEntryNo(int fsValue){
        return setValue("nEntryNox", fsValue);
    }
    
    /**
     * @return The Entry no.
     */
    public int getEntryNo(){
        return (int) getValue("nEntryNox");
    }
    
     /**
     * Sets the email address.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setEmail(String fsValue){
        return setValue("sEmailAdd", fsValue);
    }
    
    /**
     * @return The email address.
     */
    public String getEmail(){
        return (String) getValue("sEmailAdd");
    }
    
    /**
     * Sets the priority.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setPriority(int fsValue){
        return setValue("nPriority", fsValue);
    }
    
    /**
     * @return The priority.
     */
    public int getPriority(){
        return (int) getValue("nPriority");
    }
    
    @Override
    public Object getValue(int fnColumn) {
        try {
            return poEntity.getObject(fnColumn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getValue(String fsColumn) {
        try {
            return poEntity.getObject(fsColumn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getSQL(){
        return "SELECT" +
                    ", sClientID" +
                    ", nEntryNox" +
                    ", sEmailAdd" +
                    ", nPriority" +
                " FROM " + getTable();
    }
    private void initialize(){
        
        try {
            poEntity = MiscUtil.xml2ResultSet(System.getProperty("sys.default.path.metadata") + XML, getTable());
            
            poEntity.last();
            poEntity.moveToInsertRow();

            MiscUtil.initRowSet(poEntity);   
            
            poEntity.insertRow();
            poEntity.moveToCurrentRow();

            poEntity.absolute(1);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    } 
    
  
    @Override
    public JSONObject newRecord() {
        pnEditMode = EditMode.ADDNEW;
        poJSON = new JSONObject();
        poJSON.put("result", "success");
        return poJSON;
    }

    @Override
    public JSONObject openRecord(String fsValue) { pnEditMode = EditMode.UPDATE;
        poJSON = new JSONObject();

        String lsSQL = MiscUtil.makeSelect(this);
        lsSQL = MiscUtil.addCondition(lsSQL, "sEmailIDx = " + SQLUtil.toSQL(fsValue));

        ResultSet loRS = poGRider.executeQuery(lsSQL);

        try {
            if (loRS.next()){
                for (int lnCtr = 1; lnCtr <= loRS.getMetaData().getColumnCount(); lnCtr++){
                    setValue(lnCtr, loRS.getObject(lnCtr));
                }

                pnEditMode = EditMode.UPDATE;

                poJSON.put("result", "success");
                poJSON.put("message", "Record loaded successfully.");
            } else {
                poJSON.put("result", "error");
                poJSON.put("message", "No record to load.");
            }
        } catch (SQLException e) {
            poJSON.put("result", "error");
            poJSON.put("message", e.getMessage());
        }

        return poJSON;
    }

    @Override
    public JSONObject saveRecord() {String lsSQL;
        
        poJSON =  new JSONObject();
        try {
            lsSQL = MiscUtil.rowset2SQL(poEntity, 
                    getTable(),
                    "",
                    "");
        
            if (pnEditMode == EditMode.ADDNEW){           
                lsSQL = MiscUtil.getNextCode(getTable(), "sEmailIDx", false, poGRider.getConnection(), "");
                poEntity.updateObject("sEmailIDx", lsSQL);
                poEntity.updateRow();

                lsSQL = MiscUtil.rowset2SQL(poEntity, getTable(), "");
            } else {            
                lsSQL = MiscUtil.rowset2SQL(poEntity, 
                                            getTable(), 
                                            "", 
                                            "sEmailIDx = " + SQLUtil.toSQL(poEntity.getString("sEmailIDx")));
            }
            
            if (!lsSQL.equals("")){
                if(poGRider.executeQuery(lsSQL, getTable(), "", "") == 0){
                    if(!poGRider.getErrMsg().isEmpty()){ 
                        poJSON.put("result", "error");
                        poJSON.put("message", poGRider.getErrMsg());
                        return poJSON;
                    }
                }else {
                    poJSON.put("result", "error");
                    poJSON.put("message", "No record updated");
                    return poJSON;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Model_Client_Mobile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return poJSON;
    }
    @Override
    public JSONObject setValue(int lnColumn, Object foValue) {
        
            poJSON = new JSONObject();
        try {
            poEntity.updateObject(lnColumn, foValue);
            poEntity.updateRow();
            poJSON.put("result", getValue(lnColumn));
            return poJSON;
        } catch (SQLException e) {
            e.printStackTrace();
            psMessage = e.getMessage();
            poJSON.put("result", "error");
            poJSON.put("message", e.getMessage());
            return poJSON;
        }
    }

    @Override
    public JSONObject setValue(String string, Object foValue) {
        try {
            return setValue(MiscUtil.getColumnIndex(poEntity, string), foValue);
        } catch (SQLException ex) {
            
            poJSON = new JSONObject();
            poJSON.put("result", "error");
            poJSON.put("message", ex.getMessage());
            return poJSON;
            
        }
        
    }
    
}
