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
public class Model_Client_Address implements GEntity{
    
    Connection poConn;          //connection
    CachedRowSet poEntity;      //rowset
    String psMessage;           //warning, success or error message
    
    public Model_Client_Address(Connection foValue){
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

    /** 
     * this is your table name
     **/
    @Override
    public String getTable() {
        return "Client_Address";
    }

    @Override
    public Object getValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValue(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    /**
     * Sets the ClientID of this record.
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setClientID(String fsValue){
        return setValuex("sClientID", fsValue);
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
    public boolean setEntryNo(int fsValue){
        return setValuex("nEntryNox", fsValue);
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
    public boolean setHouseNo(String fsValue){
        return setValuex("sHouseNox", fsValue);
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
    public boolean setAddress(String fsValue){
        return setValuex("sAddressx", fsValue);
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
    public boolean setTownID(String fsValue){
        return setValuex("sTownIDxx", fsValue);
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
    public boolean setBarangayID(String fsValue){
        return setValuex("sBrgyIDxx", fsValue);
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
    public boolean setPriority(int fsValue){
        return setValuex("nPriority", fsValue);
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
    public boolean setLatitude(int fsValue){
        return setValuex("nLatitude", fsValue);
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
    public boolean setLongitud(int fsValue){
        return setValuex("nLongitud", fsValue);
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
    public boolean setPrimary(String fsValue){
        return setValuex("cPrimaryx", fsValue);
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
                    ", sClientID" +
                    ", nEntryNox" +
                    ", sHouseNox" +
                    ", sAddressx" +
                    ", sTownIDxx" +
                    ", sBrgyIDxx" +
                    ", nPriority" +
                    ", nLatitude" +
                    ", nLongitud" +
                    ", cPrimaryx" +
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

    @Override
    public JSONObject setValue(int i, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JSONObject setValue(String string, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
