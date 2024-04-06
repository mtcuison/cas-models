package org.guanzon.clients;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import javax.sql.rowset.CachedRowSet;
import org.rmj.appdriver.MiscUtil;
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.constants.Logical;
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author Michael Cuison
 */
public class Model_Client_Master implements GEntity{
    final String XML = "Model_Client_Master.xml";
    
    Connection poConn;          //connection
    CachedRowSet poEntity;      //rowset
    String psMessage;           //warning, success or error message
    
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
     * Sets the client type of the record.<br>
     * 0 for Individual<br>
     * 1 for Institution
     * 
     * @param fsValue 
     * @return  True if the record assignment is successful.
     */
    public boolean setClientType(String fsValue){
        return setValuex("cClientTp", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setLastName(String fsValue){
        return setValuex("sLastName", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setFirstName(String fsValue){
        return setValuex("sFrstName", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setMiddleName(String fsValue){
        return setValuex("sMiddName", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setSuffixName(String fsValue){
        return setValuex("sSuffixNm", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setFullName(String fsValue){
        return setValuex("sClientNm", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setSex(String fsValue){
        return setValuex("cGenderCd", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setCivilStatus(String fsValue){
        return setValuex("cCvilStat", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setCitizenshipID(String fsValue){
        return setValuex("sCitizenx", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setCitizenshipName(String fsValue){
        return setValuex("xCitizenx", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setBirthDate(Date fdValue){
        return setValuex("dBirthDte", fdValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setBirthPlaceID(String fsValue){
        return setValuex("sBirthPlc", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setBirthPlaceName(String fsValue){
        return setValuex("xBirthPlc", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setAdditionalInfo(String fsValue){
        return setValuex("sAddlInfo", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setSpouseID(String fsValue){
        return setValuex("sSpouseID", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setSpouseName(String fsValue){
        return setValuex("xSpouseNm", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setTaxIDNumber(String fsValue){
        return setValuex("sTaxIDNox", fsValue);
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
     * @return  True if the record assignment is successful.
     */
    public boolean setLoanReceivableClient(boolean fbValue){
        return setValuex("cLRClient", fbValue ? "1" : "0");
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
     * @return  True if the record assignment is successful.
     */
    public boolean setMotorcycleSalesClient(boolean fbValue){
        return setValuex("cMCClient", fbValue ? "1" : "0");
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
     * @return  True if the record assignment is successful.
     */
    public boolean setServiceCenterClient(boolean fbValue){
        return setValuex("cSCClient", fbValue ? "1" : "0");
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
     * @return  True if the record assignment is successful.
     */
    public boolean setSparepartsSalesClient(boolean fbValue){
        return setValuex("cSPClient", fbValue ? "1" : "0");
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
     * @return  True if the record assignment is successful.
     */
    public boolean setCellphoneSalesClient(boolean fbValue){
        return setValuex("cCPClient", fbValue ? "1" : "0");
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
    
//    private String getSQL(){
//        return "SELECT" +
//                    "  sClientID" +
//                    ", cClientTp" +
//                    ", sLastName" +
//                    ", sFrstName" +
//                    ", sMiddName" +
//                    ", sSuffixNm" +
//                    ", sMaidenNm" +
//                    ", sCompnyNm" +
//                    ", cGenderCd" +
//                    ", cCvilStat" +
//                    ", sCitizenx" +
//                    ", dBirthDte" +
//                    ", sBirthPlc" +
//                    ", sAddlInfo" +
//                    ", sSpouseID" +
//                    ", sTaxIDNox" +
//                    ", sLTOIDxxx" +
//                    ", sPHBNIDxx" +
//                    ", cLRClient" +
//                    ", cMCClient" +
//                    ", cSCClient" +
//                    ", cSPClient" +
//                    ", cCPClient" +
//                    ", cRecdStat" +
//                    ", sModified" +
//                    ", dModified" +
//                    ", '' xBirthPlc" +
//                    ", '' xCitizenx" +
//                    ", '' xSpouseNm" +
//                " FROM " + getTable();
//    }
    
    private void initialize(){        
        try {
            poEntity = MiscUtil.xml2ResultSet(System.getProperty("sys.default.path.metadata") + XML, getTable());
            
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