package org.guanzon.clients;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import org.guanzon.appdriver.agent.ShowDialogFX;
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
public class Model_Client_Address implements GEntity{
    
    
    final String XML = "Model_Client_Address.xml";
    Connection poConn;          //connection
    CachedRowSet poEntity;      //rowset
    String psMessage;           //warning, success or error message
    
    GRider poGRider;
    int pnEditMode;
    public JSONObject poJSON;
    
    public Model_Client_Address(Connection foValue, GRider poValue){
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
        try {
            return poEntity.getMetaData().getColumnCount(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return -1;
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
     * this is your table name
     **/
    @Override
    public String getTable() {
        return "Client_Address";
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


    
    /**
     * Sets the AddressID of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setAddressID(String fsValue){
        return setValue("sAddrssID", fsValue);
    }
    
    /** 
     * @return The AddressID of this record. 
     */
    public String getAddressID(){
        return (String) getValue("sAddrssID");
    }
    
    /**
     * Sets the ClientID of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setClientID(String fsValue){
        return setValue("sClientID", fsValue);
    }
    
    /** 
     * @return The ClientID of this record. 
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
     * Sets the house no.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setHouseNo(String fsValue){
        return setValue("sHouseNox", fsValue);
    }
    
    /**
     * @return The house no.
     */
    public String getHouseNo(){
        return (String) getValue("sHouseNox");
    }
    
    /**
     * Sets the address.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setAddress(String fsValue){
        return setValue("sAddressx", fsValue);
    }
    
    /**
     * @return The address.
     */
    public String getAddress(){
        return (String) getValue("sAddressx");
    }
    /**
     * Sets the town id.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setTownID(String fsValue){
        return setValue("sTownIDxx", fsValue);
    }
    
    /**
     * @return The town id.
     */
    public String getTownID(){
        return (String) getValue("sTownIDxx");
    }
    /**
     * Sets the barangay id.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setBarangayID(String fsValue){
        return setValue("sBrgyIDxx", fsValue);
    }
    
    /**
     * @return The barangay id.
     */
    public String getBarangayID(){
        return (String) getValue("sBrgyIDxx");
    }
    
    /**
     * Sets the Entry no.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setPriority(int fsValue){
        return setValue("nPriority", fsValue);
    }
    
    /**
     * @return The Entry no.
     */
    public int getPriority(){
        return (int) getValue("nPriority");
    }
    
    /**
     * Sets the Latitude.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setLatitude(int fsValue){
        return setValue("nLatitude", fsValue);
    }
    
    /**
     * @return The Latitude.
     */
    public int getLatitude(){
        return (int) getValue("nLatitude");
    }
    /**
     * Sets the Latitude.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setLongitud(int fsValue){
        return setValue("nLongitud", fsValue);
    }
    
    /**
     * @return The Latitude.
     */
    public int getLongitud(){
        return (int) getValue("nLongitud");
    }
    
    /**
     * Sets the primary address.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setPrimary(String fsValue){
        return setValue("cPrimaryx", fsValue);
    }
    
    /**
     * @return The primary address.
     */
    public String getPrimary(){
        return (String) getValue("cPrimaryx");
    }
    
    /**
     * Sets record as active.
     * 
     * @param fbValue
     * @return  True if the record assignment is successful.
     */
    public JSONObject setActive(boolean fbValue){
        return setValue("cRecdStat", fbValue ? "1" : "0");
    }
    
    /**
     * @return If record is active. 
     */
    public boolean isActive(){
        return ((String) getValue("cRecdStat")).equals("1");
    }
    
    /**
     * @return The user encoded/updated the record 
     */
    public String getModifiedBy(){
        return (String) getValue("sModified");
    }
    
    /**
     * Sets the date and time the record was modified.
     * 
     * @param fdValue 
     * @return  True if the record assignment is successful.
     */
    public JSONObject setModifiedDate(Date fdValue){
        return setValue("dModified", fdValue);
    }
    
    /**
     * @return The date and time the record was modified.
     */
    public Date getModifiedDate(){
        return (Date) getValue("dModified");
    }
    
    public String getMessage(){
        return psMessage;
    }
        private String getSQL(){
        return "SELECT" +
                    ", sAddrssID" +
                    ", sClientID" +
                    ", sHouseNox" +
                    ", sAddressx" +
                    ", sBrgyIDxx" +
                    ", sTownIDxx" +
                    ", nLatitude" +
                    ", nLongitud" +
                    ", cPrimaryx" +
                    ", cRecdStat" +
                    ", sModified" +
                    ", dModified" +
                " FROM " + getTable();
    }
    private void initialize(){
        
        try {
            
            poEntity = MiscUtil.xml2ResultSet(System.getProperty("sys.default.path.metadata") + XML, getTable());
            
            poEntity.last();
            poEntity.moveToInsertRow();

            MiscUtil.initRowSet(poEntity);      
            poEntity.updateInt("cPrimaryx", 1);
            poEntity.updateString("cRecdStat", RecordStatus.ACTIVE);
            
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
        
        //replace with the primary key column info
        setAddressID(MiscUtil.getNextCode(getTable(), "sAddrssID", true, poGRider.getConnection(), poGRider.getBranchCode()));
        
        poJSON = new JSONObject();
        poJSON.put("result", "success");
        return poJSON;
    }

    @Override
    public JSONObject openRecord(String fsValue) {
        poJSON = new JSONObject();

        String lsSQL = MiscUtil.makeSelect(this);
        lsSQL = MiscUtil.addCondition(lsSQL, "sAddrssID = " + SQLUtil.toSQL(fsValue));

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
    public JSONObject saveRecord() {
        poJSON = new JSONObject();
        
        if (pnEditMode == EditMode.ADDNEW || pnEditMode == EditMode.UPDATE){
            String lsSQL;
            if (pnEditMode == EditMode.ADDNEW){
                //replace with the primary key column info
                setAddressID(MiscUtil.getNextCode(getTable(), "sAddrssID", true, poGRider.getConnection(), poGRider.getBranchCode()));
                
                setModifiedDate(poGRider.getServerDate());
                lsSQL = MiscUtil.makeSQL(this, "xBrgyName»xTownName»xProvName");
                
                if (!lsSQL.isEmpty()){
                    if (poGRider.executeQuery(lsSQL, getTable(), poGRider.getBranchCode(), "") > 0){
                        poJSON.put("result", "success");
                        poJSON.put("message", "Record saved successfully.");
                    } else {
                        poJSON.put("result", "error");
                        poJSON.put("message", poGRider.getErrMsg());
                    }
                } else {
                    poJSON.put("result", "error");
                    poJSON.put("message", "No record to save.");
                }
            } else {
                Model_Client_Address loOldEntity = new Model_Client_Address(poConn, poGRider);
                
                setModifiedDate(poGRider.getServerDate());
                //replace with the primary key column info
                JSONObject loJSON = loOldEntity.openRecord(this.getAddressID());
                
                if ("success".equals((String) loJSON.get("result"))){
                    //replace the condition based on the primary key column of the record
                    lsSQL = MiscUtil.makeSQL(this, loOldEntity, "sAddrssID = " + SQLUtil.toSQL(this.getAddress()), "xBrgyName»xTownName»xProvName");
                    
                    if (!lsSQL.isEmpty()){
                        if (poGRider.executeQuery(lsSQL, getTable(), poGRider.getBranchCode(), "") > 0){
                            poJSON.put("result", "success");
                            poJSON.put("message", "Record saved successfully.");
                        } else {
                            poJSON.put("result", "error");
                            poJSON.put("message", poGRider.getErrMsg());
                        }
                    } else {
                        poJSON.put("result", "success");
                        poJSON.put("message", "No updates has been made.");
                    }
                } else {
                    poJSON.put("result", "error");
                    poJSON.put("message", "Record discrepancy. Unable to save record.");
                }
            }
        } else {
            poJSON.put("result", "error");
            poJSON.put("message", "Invalid update mode. Unable to save record.");
            return poJSON;
        }
        
        return poJSON;

    }

    @Override
    public JSONObject setValue(int lnColumn, Object foValue) {
        
            poJSON = new JSONObject();
        try {
            poEntity.updateObject(lnColumn, foValue);
            poEntity.updateRow();
            poJSON.put("result", "success");
            poJSON.put("value", getValue(lnColumn));
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
    public JSONObject SearchBarangay(String fsValue, boolean fbByCode){
        String lsSQL = "SELECT " +
                            "  a.sBrgyIDxx" +
                            ", a.sBrgyName" +
                            ", b.sTownName" + 
                            ", b.sZippCode" +
                            ", c.sProvName" + 
                            ", c.sProvIDxx" +
                            ", b.sTownIDxx" +
                        " FROM Barangay a" + 
                            ", TownCity b" +
                            ", Province c" +
                        " WHERE a.sTownIDxx = b.sTownIDxx" + 
                            " AND b.sProvIDxx = c.sProvIDxx" + 
                            " AND a.cRecdStat = '1'" + 
                            " AND b.cRecdStat = '1'" + 
                            " AND c.cRecdStat = '1'";
        
        if (fbByCode){
            lsSQL = MiscUtil.addCondition(lsSQL, "a.sBrgyIDxx = " + SQLUtil.toSQL(fsValue));
            
            ResultSet loRS = poGRider.executeQuery(lsSQL);
            
            return ShowDialogFX.Browse(poGRider, 
                                            loRS, 
                                            "ID»Barangay»Town»Province", 
                                            "sBrgyIDxx»sBrgyName»sTownName»sProvName");
        }
        
        return ShowDialogFX.Search(poGRider, 
                                        lsSQL, 
                                        fsValue, 
                                        "ID»Barangay»Town»Province", 
                                        "sBrgyIDxx»sBrgyName»sTownName»sProvName", 
                                        "a.sBrgyIDxx»a.sBrgyName»b.sTownName»c.sProvName", 
                                        1);
    }
    
    public JSONObject SearchTown(String fsValue, boolean fbByCode){
        String lsSQL = "SELECT " +
                            "  a.sTownIDxx" +
                            ", a.sTownName" + 
                            ", a.sZippCode" +
                            ", b.sProvName" + 
                            ", b.sProvIDxx" +
                        " FROM TownCity a" +
                            ", Province b" +
                        " WHERE a.sProvIDxx = b.sProvIDxx" + 
                            " AND a.cRecdStat = '1'";
        
        if (fbByCode){
            lsSQL = MiscUtil.addCondition(lsSQL, "a.sTownIDxx = " + SQLUtil.toSQL(fsValue));
            
            ResultSet loRS = poGRider.executeQuery(lsSQL);
            
            return ShowDialogFX.Browse(poGRider, 
                                            loRS, 
                                            "ID»Town»Postal Code»Province", 
                                            "sTownIDxx»sTownName»sZippCode»sProvName");
        }
        
        return ShowDialogFX.Search(poGRider, 
                                        lsSQL, 
                                        fsValue, 
                                        "ID»Town»Postal Code»Province", 
                                        "sTownIDxx»sTownName»sZippCode»sProvName", 
                                        "a.sTownIDxx»a.sTownName»a.sZippCode»b.sProvName", 
                                        1);
    }

    @Override
    public int getEditMode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
