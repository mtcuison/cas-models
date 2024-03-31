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
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.constants.Logical;
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author Michael Cuison
 */
public class Model_Client_Master implements GEntity{
    Connection poConn;          //connection
    CachedRowSet poEntity;      //rowset
    
    public Model_Client_Master(Connection foValue){
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
        return "Client_Master";
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
        try {
            poEntity.updateObject(fnColumn, foValue);
            poEntity.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        try {
            setValue(MiscUtil.getColumnIndex(poEntity, fsColumn), foValue);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Sets the ID of this record.
     * 
     * @param fsValue 
     */
    public void setClientID(String fsValue){
        setValue("sClientID", fsValue);
    }
    
    /** 
     * @return The ID of this record. 
     */
    public String getClientID(){
        return (String) getValue("sClientID");
    }
    
    /**
     * Sets the client type of the record.<br>
     * 0 for Individual<br>
     * 1 for Institution
     * 
     * @param fsValue 
     */
    public void setClientType(String fsValue){
        setValue("cClientTp", fsValue);
    }
    
    /**
     * @return The client type of the record.
     */
    public String getClientType(){
        return (String) getValue("cClientTp");
    }
    
    /**
     * Sets the last name of the client.
     * 
     * @param fsValue 
     */
    public void setLastName(String fsValue){
        setValue("sLastName", fsValue);
    }
    
    /**
     * @return The last name of the client.
     */
    public String getLastName(){
        return (String) getValue("sLastName");
    }
    
    /**
     * Sets the first name of the client.
     * 
     * @param fsValue 
     */
    public void setFirstName(String fsValue){
        setValue("sFrstName", fsValue);
    }
    
    /**
     * @return The last name of the client.
     */
    public String getFirstName(){
        return (String) getValue("sFrstName");
    }
    
    /**
     * Sets the middle name of the client.
     * 
     * @param fsValue 
     */
    public void setMiddleName(String fsValue){
        setValue("sMiddName", fsValue);
    }
    
    /**
     * @return The middle name of the client.
     */
    public String getMiddleName(){
        return (String) getValue("sMiddName");
    }
    
    /**
     * Sets the suffix name of the client.
     * 
     * @param fsValue 
     */
    public void setSuffixName(String fsValue){
        setValue("sSuffixNm", fsValue);
    }
    
    /**
     * @return The suffix name of the client.
     */
    public String getSuffixName(){
        return (String) getValue("sSuffixNm");
    }
    
    /**
     * Sets the complete name of the client.
     * 
     * @param fsValue 
     */
    public void setFullName(String fsValue){
        setValue("sClientNm", fsValue);
    }
    
    /**
     * @return The complete name of the client.
     */
    public String getFullName(){
        return (String) getValue("sClientNm");
    }
    
    /**
     * Set the sex of the client.<br>
     * 0 for Male
     * 1 for Female
     * 2 for LGBT
     * 
     * @param fsValue 
     */
    public void setSex(String fsValue){
        setValue("cGenderCd", fsValue);
    }
    
    /**
     * @return The sex of the client.
     */
    public String getSex(){
        return (String) getValue("cGenderCd");
    }
    
    /**
     * Set the civil status of the client.<br>
     * 0 for Single
     * 1 for Married
     * 2 for Separated
     * 3 for Widowed
     * 4 for Single Parent
     * 5 for Single Parent w/ Live-in Partner
     * 
     * @param fsValue 
     */
    public void setCivilStatus(String fsValue){
        setValue("cCvilStat", fsValue);
    }
    
    /**
     * @return The civil status of the client.
     */
    public String getCivilStatus(){
        return (String) getValue("cCvilStat");
    }
    
    /**
     * Sets the citizenship ID of the client.
     * 
     * @param fsValue 
     */
    public void setCitizenshipID(String fsValue){
        setValue("sCitizenx", fsValue);
    }
    
    /**
     * @return The citizenship ID of the client.
     */
    public String getCitizenshipID(){
        return (String) getValue("sCitizenx");
    }
    
    /**
     * Sets the citizenship name of the client.
     * 
     * @param fsValue 
     */
    public void setCitizenshipName(String fsValue){
        setValue("xCitizenx", fsValue);
    }
    
    /**
     * @return The citizenship name of the client.
     */
    public String getCitizenshipName(){
        return (String) getValue("xCitizenx");
    }
    
    /**
     * Sets the date of birth of the client.
     * 
     * @param fdValue 
     */
    public void setBirthDate(Date fdValue){
        setValue("dBirthDte", fdValue);
    }
    
    /**
     * @return The date of birth of the client.
     */
    public Date getBirthDate(){
        return (Date) getValue("dBirthDte");
    }
    
    /**
     * Sets the birth place ID of the client.
     * 
     * @param fsValue 
     */
    public void setBirthPlaceID(String fsValue){
        setValue("sBirthPlc", fsValue);
    }
    
    /**
     * @return The birth place ID of the client.
     */
    public String getBirthPlaceID(){
        return (String) getValue("sBirthPlc");
    }
    
    /**
     * Sets the birth place name of the client.
     * 
     * @param fsValue 
     */
    public void setBirthPlaceName(String fsValue){
        setValue("xBirthPlc", fsValue);
    }
    
    /**
     * @return The birth place name of the client.
     */
    public String getBirthPlaceName(){
        return (String) getValue("xBirthPlc");
    }
    
    /**
     * Sets additional information for the client.
     * 
     * @param fsValue 
     */
    public void setAdditionalInfo(String fsValue){
        setValue("sAddlInfo", fsValue);
    }
    
    /** 
     * @return The additional information for the client.
     */
    public String getAdditionalInfo(){
        return (String) getValue("sAddlInfo");
    }
    
    /**
     * Sets the spouse ID of the client.
     * 
     * @param fsValue 
     */
    public void setSpouseID(String fsValue){
        setValue("sSpouseID", fsValue);
    }
    
    /**
     * @return The spouse ID of the client.
     */
    public String getSpouseID(){
        return (String) getValue("sSpouseID");
    }
    
    /**
     * Sets the spouse name of the client.
     * 
     * @param fsValue 
     */
    public void setSpouseName(String fsValue){
        setValue("xSpouseNm", fsValue);
    }
    
    /**
     * @return The spouse name of the client.
     */
    public String getSpouseName(){
        return (String) getValue("xSpouseNm");
    }
    
    /**
     * Sets the tax identification number of the client.
     * 
     * @param fsValue 
     */
    public void setTaxIDNumber(String fsValue){
        setValue("sTaxIDNox", fsValue);
    }
    
    /**
     * @return The tax identification number of the client.
     */
    public String getTaxIDNumber(){
        return (String) getValue("sTaxIDNox");
    }
    
    /**
     * Sets if the client has loan to the company.
     * 
     * @param fbValue 
     */
    public void setLoanReceivableClient(boolean fbValue){
        setValue("cLRClient", fbValue ? "1" : "0");
    }
    
    /**
     * @return If the client has loan to the company.
     */
    public boolean isLoanReceivableClient(){
        return ((String) getValue("cLRClient")).equals("1");
    }
    
    /**
     * Sets if the client purchased motorcycle.
     * 
     * @param fbValue 
     */
    public void setMotorcycleSalesClient(boolean fbValue){
        setValue("cMCClient", fbValue ? "1" : "0");
    }
    
    /**
     * @return If the client purchased motorcycle.
     */
    public boolean isMotorcycleSalesClient(){
        return ((String) getValue("cMCClient")).equals("1");
    }
    
    /**
     * Sets if the client is a job order customer.
     * 
     * @param fbValue 
     */
    public void setServiceCenterClient(boolean fbValue){
        setValue("cSCClient", fbValue ? "1" : "0");
    }
    
    /**
     * @return If the client is a job order customer.
     */
    public boolean isServiceCenterClient(){
        return ((String) getValue("cSCClient")).equals("1");
    }
    
    /**
     * Sets if the client purchased spare parts.
     * 
     * @param fbValue 
     */
    public void setSparepartsSalesClient(boolean fbValue){
        setValue("cSPClient", fbValue ? "1" : "0");
    }
    
    /**
     * @return If the client purchase spare parts.
     */
    public boolean isSparepartsSalesClient(){
        return ((String) getValue("cSPClient")).equals("1");
    }
    
    /**
     * Sets if the client purchased mobile phone.
     * 
     * @param fbValue 
     */
    public void setCellphoneSalesClient(boolean fbValue){
        setValue("cCPClient", fbValue ? "1" : "0");
    }
    
    /**
     * @return If the client purchased mobile phone.
     */
    public boolean isCellphoneSalesClient(){
        return ((String) getValue("cCPClient")).equals("1");
    }
    
    /**
     * Sets record as active.
     * 
     * @param fbValue 
     */
    public void setActive(boolean fbValue){
        setValue("cRecdStat", fbValue ? "1" : "0");
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
     */
    public void setModifiedBy(String fsValue){
        setValue("sModified", fsValue);
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
     */
    public void setModifiedDate(Date fdValue){
        setValue("dModified", fdValue);
    }
    
    /**
     * @return The date and time the record was modified.
     */
    public Date getModifiedDate(){
        return (Date) getValue("dModified");
    }
    
    protected String getSQL(){
        return "SELECT" +
                    "  sClientID" +
                    ", cClientTp" +
                    ", sLastName" +
                    ", sFrstName" +
                    ", sMiddName" +
                    ", sSuffixNm" +
                    ", sClientNm" +
                    ", cGenderCd" +
                    ", cCvilStat" +
                    ", sCitizenx" +
                    ", dBirthDte" +
                    ", sBirthPlc" +
                    ", sAddlInfo" +
                    ", sSpouseID" +
                    ", sTaxIDNox" +
                    ", cLRClient" +
                    ", cMCClient" +
                    ", cSCClient" +
                    ", cSPClient" +
                    ", cCPClient" +
                    ", cRecdStat" +
                    ", sModified" +
                    ", dModified" +
                    ", '' xBirthPlc" +
                    ", '' xCitizenx" +
                    ", '' xSpouseNm" +
                " FROM " + getTable();
    }
    
    protected void initialize(){
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
            poEntity.updateString("cClientTp", Logical.NO);
            poEntity.updateString("cCvilStat", Logical.NO);
            poEntity.updateString("cLRClient", Logical.NO);
            poEntity.updateString("cMCClient", Logical.NO);
            poEntity.updateString("cSCClient", Logical.NO);
            poEntity.updateString("cSPClient", Logical.NO);
            poEntity.updateString("cCPClient", Logical.NO);
            poEntity.updateString("cRecdStat", RecordStatus.ACTIVE);
            
            poEntity.insertRow();
            poEntity.moveToCurrentRow();

            poEntity.absolute(1);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }    
}