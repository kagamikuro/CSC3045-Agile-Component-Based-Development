package uk.ac.qub.agile.entry;

public class SprintTeam {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sprintteam.id
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sprintteam.teamName
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    private String teamname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sprintteam.isAssigned
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    private Boolean isassigned;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sprintteam.id
     *
     * @return the value of sprintteam.id
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sprintteam.id
     *
     * @param id the value for sprintteam.id
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sprintteam.teamName
     *
     * @return the value of sprintteam.teamName
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public String getTeamname() {
        return teamname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sprintteam.teamName
     *
     * @param teamname the value for sprintteam.teamName
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sprintteam.isAssigned
     *
     * @return the value of sprintteam.isAssigned
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public Boolean getIsassigned() {
        return isassigned;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sprintteam.isAssigned
     *
     * @param isassigned the value for sprintteam.isAssigned
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void setIsassigned(Boolean isassigned) {
        this.isassigned = isassigned;
    }
}