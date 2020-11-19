package uk.ac.qub.agile.entry;

import java.util.ArrayList;
import java.util.List;

public class SprintExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public SprintExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSptinttitleIsNull() {
            addCriterion("sptintTitle is null");
            return (Criteria) this;
        }

        public Criteria andSptinttitleIsNotNull() {
            addCriterion("sptintTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSptinttitleEqualTo(String value) {
            addCriterion("sptintTitle =", value, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleNotEqualTo(String value) {
            addCriterion("sptintTitle <>", value, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleGreaterThan(String value) {
            addCriterion("sptintTitle >", value, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleGreaterThanOrEqualTo(String value) {
            addCriterion("sptintTitle >=", value, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleLessThan(String value) {
            addCriterion("sptintTitle <", value, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleLessThanOrEqualTo(String value) {
            addCriterion("sptintTitle <=", value, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleLike(String value) {
            addCriterion("sptintTitle like", value, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleNotLike(String value) {
            addCriterion("sptintTitle not like", value, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleIn(List<String> values) {
            addCriterion("sptintTitle in", values, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleNotIn(List<String> values) {
            addCriterion("sptintTitle not in", values, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleBetween(String value1, String value2) {
            addCriterion("sptintTitle between", value1, value2, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andSptinttitleNotBetween(String value1, String value2) {
            addCriterion("sptintTitle not between", value1, value2, "sptinttitle");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andInprogressIsNull() {
            addCriterion("inProgress is null");
            return (Criteria) this;
        }

        public Criteria andInprogressIsNotNull() {
            addCriterion("inProgress is not null");
            return (Criteria) this;
        }

        public Criteria andInprogressEqualTo(Boolean value) {
            addCriterion("inProgress =", value, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressNotEqualTo(Boolean value) {
            addCriterion("inProgress <>", value, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressGreaterThan(Boolean value) {
            addCriterion("inProgress >", value, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressGreaterThanOrEqualTo(Boolean value) {
            addCriterion("inProgress >=", value, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressLessThan(Boolean value) {
            addCriterion("inProgress <", value, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressLessThanOrEqualTo(Boolean value) {
            addCriterion("inProgress <=", value, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressIn(List<Boolean> values) {
            addCriterion("inProgress in", values, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressNotIn(List<Boolean> values) {
            addCriterion("inProgress not in", values, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressBetween(Boolean value1, Boolean value2) {
            addCriterion("inProgress between", value1, value2, "inprogress");
            return (Criteria) this;
        }

        public Criteria andInprogressNotBetween(Boolean value1, Boolean value2) {
            addCriterion("inProgress not between", value1, value2, "inprogress");
            return (Criteria) this;
        }

        public Criteria andBlockedIsNull() {
            addCriterion("blocked is null");
            return (Criteria) this;
        }

        public Criteria andBlockedIsNotNull() {
            addCriterion("blocked is not null");
            return (Criteria) this;
        }

        public Criteria andBlockedEqualTo(Boolean value) {
            addCriterion("blocked =", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedNotEqualTo(Boolean value) {
            addCriterion("blocked <>", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedGreaterThan(Boolean value) {
            addCriterion("blocked >", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("blocked >=", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedLessThan(Boolean value) {
            addCriterion("blocked <", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedLessThanOrEqualTo(Boolean value) {
            addCriterion("blocked <=", value, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedIn(List<Boolean> values) {
            addCriterion("blocked in", values, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedNotIn(List<Boolean> values) {
            addCriterion("blocked not in", values, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedBetween(Boolean value1, Boolean value2) {
            addCriterion("blocked between", value1, value2, "blocked");
            return (Criteria) this;
        }

        public Criteria andBlockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("blocked not between", value1, value2, "blocked");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sprint
     *
     * @mbg.generated do_not_delete_during_merge Sun Nov 15 21:28:18 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sprint
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}