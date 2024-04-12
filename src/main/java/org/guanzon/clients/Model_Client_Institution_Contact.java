package org.guanzon.clients;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import org.guanzon.appdriver.base.MiscUtil;
import org.guanzon.appdriver.constant.RecordStatus;
import org.guanzon.appdriver.iface.GEntity;
import org.json.simple.JSONObject;

/**
 *
 * @author Michael Cuison
 */
public class Model_Client_Institution_Contact implements GEntity{
    Connection poConn;          //connection
    CachedRowSet poEntity;      //rowset
    String psMessage;           //warning, success or error message
    
    public Model_Client_Institution_Contact(Connection foValue){
        if (foValue == null){
            System.err.println("Database connection is not set.");
            System.exit(1);
        }
        
        poConn = foValue;
        
        initialize();
    }

    @Override
    public String getColumn(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumn(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValue(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMessage(){
        return psMessage;
    }
    /**
     * Sets the Contact ID of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactID(String fsValue){
        setValuex("sContctID", fsValue);
        return true;
    }
    
    /** 
     * @return The Contact ID of this record. 
     */
    public String getContactID(){
        return (String) getValue("sContctID");
    }
    
    /**
     * Sets the ID of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setClientID(String fsValue){
        setValuex("sClientID", fsValue);
        return true;
    }
    
    /** 
     * @return The ID of this record. 
     */
    public String getClientID(){
        return (String) getValue("sClientID");
    }
    /**
     * Sets the name of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPerson(String fsValue){
        setValuex("sCPerson1", fsValue);
        return true;
    }
    
    /** 
     * @return The name of contact person of this record. 
     */
    public String getContactPerson(){
        return (String) getValue("sCPerson1");
    }
    /**
     * Sets the position of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonPosition(String fsValue){
        setValuex("sCPPosit1", fsValue);
        return true;
    }
    
    /** 
     * @return The position of contact person of this record. 
     */
    public String getContactPersonPosition(){
        return (String) getValue("sCPPosit1");
    }
    /**
     * Sets the mobile no of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonMobileNo(String fsValue){
        setValuex("sMobileNo", fsValue);
        return true;
    }
    
    /** 
     * @return The mobile no of contact person of this record. 
     */
    public String getContactPersonMobileNo(){
        return (String) getValue("sMobileNo");
    }
    /**
     * Sets the telephone no of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonTelphoneNo(String fsValue){
        setValuex("sTelNoxxx", fsValue);
        return true;
    }
    
    /** 
     * @return The telephone no of contact person of this record. 
     */
    public String getContactPersonTelphoneNo(){
        return (String) getValue("sTelNoxxx");
    }
    /**
     * Sets the fax no of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonsFaxNo(String fsValue){
        setValuex("sFaxNoxxx", fsValue);
        return true;
    }
    
    /** 
     * @return The Fax no of contact person of this record. 
     */
    public String getContactPersonsFaxNo(){
        return (String) getValue("sFaxNoxxx");
    }
    
    /**
     * Sets the email of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonsEmail(String fsValue){
        setValuex("sEMailAdd", fsValue);
        return true;
    }
    
    /** 
     * @return The email of contact person of this record. 
     */
    public String getContactPersonsEmail(){
        return (String) getValue("sEMailAdd");
    }
    
    /**
     * Sets the account1 of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonsAcct1(String fsValue){
        setValuex("sAccount1", fsValue);
        return true;
    }
    
    /** 
     * @return The account1 of contact person of this record. 
     */
    public String getContactPersonsAcct1(){
        return (String) getValue("sAccount1");
    }
    
    /**
     * Sets the account2 of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonsAcct2(String fsValue){
        setValuex("sAccount2", fsValue);
        return true;
    }
    
    /** 
     * @return The account2 of contact person of this record. 
     */
    public String getContactPersonsAcct2(){
        return (String) getValue("sAccount2");
    }
    /**
     * Sets the account3 of contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonsAcct3(String fsValue){
        setValuex("sAccount3", fsValue);
        return true;
    }
    
    /** 
     * @return The account3 of contact person of this record. 
     */
    public String getContactPersonsAcct3(){
        return (String) getValue("sAccount3");
    }
    
    /**
     * Sets the Remarks for contact person of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setContactPersonsRemarks(String fsValue){
        setValuex("sRemarksx", fsValue);
        return true;
    }
    
    /** 
     * @return The Remarks for contact person of this record. 
     */
    public String getContactPersonsRemarks(){
        return (String) getValue("sRemarksx");
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
    
    private String getSQL(){
        return "SELECT" +
                    ", sContctID" +
                    ", sClientID" +
                    ", sCPerson1" +
                    ", sCPPosit1" +
                    ", sMobileNo" +
                    ", sTelNoxxx" +
                    ", sFaxNoxxx" +
                    ", sEMailAdd" +
                    ", sAccount1" +
                    ", sAccount2" +
                    ", sAccount3" +
                    ", sRemarksx" +
                    ", cRecdStat" +
                    ", sModified" +
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

    @Override
    public JSONObject setValue(int i, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JSONObject setValue(String string, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JSONObject newRecord() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JSONObject openRecord(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JSONObject saveRecord() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
