package entity;

public class ProductCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_CATEGORY.CATEGORY_ID
     *
     * @mbg.generated
     */
    private String categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_CATEGORY.C_NAME
     *
     * @mbg.generated
     */
    private String cName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_CATEGORY.C_DESC
     *
     * @mbg.generated
     */
    private String cDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    public ProductCategory(String categoryId, String cName, String cDesc) {
        this.categoryId = categoryId;
        this.cName = cName;
        this.cDesc = cDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    public ProductCategory() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_CATEGORY.CATEGORY_ID
     *
     * @return the value of PRODUCT_CATEGORY.CATEGORY_ID
     *
     * @mbg.generated
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_CATEGORY.CATEGORY_ID
     *
     * @param categoryId the value for PRODUCT_CATEGORY.CATEGORY_ID
     *
     * @mbg.generated
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_CATEGORY.C_NAME
     *
     * @return the value of PRODUCT_CATEGORY.C_NAME
     *
     * @mbg.generated
     */
    public String getcName() {
        return cName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_CATEGORY.C_NAME
     *
     * @param cName the value for PRODUCT_CATEGORY.C_NAME
     *
     * @mbg.generated
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_CATEGORY.C_DESC
     *
     * @return the value of PRODUCT_CATEGORY.C_DESC
     *
     * @mbg.generated
     */
    public String getcDesc() {
        return cDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_CATEGORY.C_DESC
     *
     * @param cDesc the value for PRODUCT_CATEGORY.C_DESC
     *
     * @mbg.generated
     */
    public void setcDesc(String cDesc) {
        this.cDesc = cDesc == null ? null : cDesc.trim();
    }
}