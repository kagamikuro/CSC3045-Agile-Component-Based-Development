package uk.ac.qub.agile.entry;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.title
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.selectable
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    private Boolean selectable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.title
     *
     * @return the value of role.title
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.title
     *
     * @param title the value for role.title
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.selectable
     *
     * @return the value of role.selectable
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public Boolean getSelectable() {
        return selectable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.selectable
     *
     * @param selectable the value for role.selectable
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }
}