package org.guanzon.clients;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import org.rmj.appdriver.MiscUtil;
import org.rmj.appdriver.constants.Logical;
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author Michael Cuison
 */
public class Model_Client_Mobile implements GEntity{
    Connection poConn;          //connection
    CachedRowSet poEntity;      //rowset
    String psMessage;           //warning, success or error message
    
    public Model_Client_Mobile(Connection foValue){
        if (foValue == null){
            System.err.println("Database connection is not set.");
            System.exit(1);
        }
        
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
    public String getTable() {
        return "Client_Mobile";
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
    
    @Override
    public void list() {
        Method[] methods = this.getClass().getMethods();
        
        System.out.println("List of public methods for class " + this.getClass().getName() + ":");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
    
    @Override
    public void setValue(int fnColumn, Object foValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Sets the ID of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setMobileID(String fsValue){
        return setValuex("sMobileID", fsValue);
    }
    
    /** 
     * @return The ID of this record. 
     */
    public String getMobileID(){
        return (String) getValue("sMobileID");
    }
    
    /**
     * Sets the Owner ID of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setClientID(String fsValue){
        return setValuex("sClientID", fsValue);
    }
    
    /**
     * @return The Owner ID of this record. 
     */
    public String getClientID(){
        return (String) getValue("sClientID");
    }
    
    /**
     * Sets the contact number.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactNo(String fsValue){
        return setValuex("sMobileNo", fsValue);
    }
    
    /**
     * @return The contact number.
     */
    public String getContactNo(){
        return (String) getValue("sMobileNo");
    }
    
    /**
     * Sets the type of the contact number.<br>
     * 0 for Mobile No.<br>
     * 1 for Telephone No.<br>
     * 2 for Fax Machine No.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactType(String fsValue){
        return setValuex("cMobileTp", fsValue);
    }
    
    /**
     * @return The type of  the contact number. 
     */
    public String getContactType(){
        return (String) getValue("cMobileTp");
    }
    
    /**
     * Sets the ownership of the contact number.<br>
     * 0 for Personal<br>
     * 1 for Company Issued<br>
     * 2 for Others
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setOwnership(String fsValue){
        return setValuex("cOwnerxxx", fsValue);
    }
    
    /**
     * @return The ownership of the contact number. 
     */
    public String getOwnership(){
        return (String) getValue("cOwnerxxx");
    }
    
    /**
     * Sets the contact number as Primary
     * 
     * @param fbValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setPrimary(boolean fbValue){
        return setValuex("cPrimaryx", fbValue ? "1" : "0");
    }
    
    /**
     * @return If the contact number set as Primary
     */
    public boolean isPrimary(){
        return ((String) getValue("cPrimaryx")).equals("1");
    }
    
    /**
     * Sets the priority number of the contact number.
     * 
     * @param fnValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setPriority(int fnValue){
        return setValuex("nPriority", fnValue);
    }
    
    /**
     * 
     * @return The priority number of the contact number. 
     */
    public int getPriority(){
        return (int) getValue("nPriority");
    }
    
    /**
     * Sets if the contact number will be receiving marketing message.
     * 
     * @param fbValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setMarketingRecipient(boolean fbValue){
        return setValuex("cIncdMktg", fbValue ? "1" : "0");
    }
    
    /**
     * @return If the contact number is receiving marketing message. 
     */
    public boolean isMarketingRecipient(){
        return ((String) getValue("cIncdMktg")).equals("1");
    }
    
    /**
     * Sets the network if the contact number. Use this method for records as Mobile numbers only.<br>
     * 0 for Globe Telecom<br>
     * 1 for Smart Communications<br>
     * 2 for Sun Cellular<br>
     * 3 for DITO Telecom
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setMobileNetwork(String fsValue){
        return setValuex("cSubscrbr", fsValue);
    }
    
    /**
     * @return The network of the contact number. Use this method for records as Mobile numbers only. 
     */
    public String getMobileNetwork(){
        return (String) getValue("cSubscrbr");
    }
    
    /**
     * Sets record as active.
     * 
     * @param fbValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setActive(boolean fbValue){
        return setValuex("cRecdStat", fbValue ? "1" : "0");
    }
    
    /**
     * @return If record is active. 
     */
    public boolean isActive(){
        return ((String) getValue("cRecdStat")).equals("1");
    }
    
    /**
     * Sets the user encoded/updated the record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setModifiedBy(String fsValue){
        return setValuex("sModified", fsValue);
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
    public boolean setModifiedDate(Date fdValue){
        return setValuex("dModified", fdValue);
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
                    "  sMobileID" +
                    ", sClientID" +
                    ", sMobileNo" +
                    ", cMobileTp" +
                    ", cOwnerxxx" +
                    ", cPrimaryx" +
                    ", nPriority" +
                    ", cIncdMktg" +
                    ", nUnreachx" +
                    ", dLastVeri" +
                    ", dInactive" +
                    ", nNoRetryx" +
                    ", cInvalidx" +
                    ", cConfirmd" +
                    ", dConfirmd" +
                    ", cSubscrbr" +
                    ", dHoldMktg" +
                    ", dMktgMsg1" +
                    ", dMktgMsg2" +
                    ", dMktgMsg3" +
                    ", cNewMobil" +
                    ", cRecdStat" +
                    ", dModified" +
                " FROM " + getTable();
    }
    
    private void initialize(){
        String lsSQL = MiscUtil.addCondition(getSQL(), "0=1");
        
        try {
            Statement loSt = poConn.createStatement();
            ResultSet loRS = loSt.executeQuery(lsSQL);
            
            poEntity = RowSetProvider.newFactory().createCachedRowSet();
            poEntity.populate(loRS);
            MiscUtil.close(loRS);
            
            poEntity.last();
            poEntity.moveToInsertRow();

            MiscUtil.initRowSet(poEntity);
            poEntity.updateString("cMobileTp", Logical.NO);
            poEntity.updateString("cOwnerxxx", Logical.NO);
            poEntity.updateString("cRecdStat", Logical.YES);
            
            poEntity.insertRow();
            poEntity.moveToCurrentRow();

            poEntity.absolute(1);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }    
    
    private boolean setValuex(int fnColumn, Object foValue) {
        try {
            poEntity.updateObject(fnColumn, foValue);
            poEntity.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
            psMessage = e.getMessage();
            return false;
        }
        return true;
    }

    private boolean setValuex(String fsColumn, Object foValue) {
        try {
            setValuex(MiscUtil.getColumnIndex(poEntity, fsColumn), foValue);
        } catch (SQLException e) {
            e.printStackTrace();
            psMessage = e.getMessage();
            return false;
        }
        return true;
    }
}