package cn.liwenye.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PomosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PomosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStartedAtIsNull() {
            addCriterion("started_at is null");
            return (Criteria) this;
        }

        public Criteria andStartedAtIsNotNull() {
            addCriterion("started_at is not null");
            return (Criteria) this;
        }

        public Criteria andStartedAtEqualTo(Date value) {
            addCriterion("started_at =", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtNotEqualTo(Date value) {
            addCriterion("started_at <>", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtGreaterThan(Date value) {
            addCriterion("started_at >", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("started_at >=", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtLessThan(Date value) {
            addCriterion("started_at <", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtLessThanOrEqualTo(Date value) {
            addCriterion("started_at <=", value, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtIn(List<Date> values) {
            addCriterion("started_at in", values, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtNotIn(List<Date> values) {
            addCriterion("started_at not in", values, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtBetween(Date value1, Date value2) {
            addCriterion("started_at between", value1, value2, "startedAt");
            return (Criteria) this;
        }

        public Criteria andStartedAtNotBetween(Date value1, Date value2) {
            addCriterion("started_at not between", value1, value2, "startedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtIsNull() {
            addCriterion("ended_at is null");
            return (Criteria) this;
        }

        public Criteria andEndedAtIsNotNull() {
            addCriterion("ended_at is not null");
            return (Criteria) this;
        }

        public Criteria andEndedAtEqualTo(Date value) {
            addCriterion("ended_at =", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtNotEqualTo(Date value) {
            addCriterion("ended_at <>", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtGreaterThan(Date value) {
            addCriterion("ended_at >", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("ended_at >=", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtLessThan(Date value) {
            addCriterion("ended_at <", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtLessThanOrEqualTo(Date value) {
            addCriterion("ended_at <=", value, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtIn(List<Date> values) {
            addCriterion("ended_at in", values, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtNotIn(List<Date> values) {
            addCriterion("ended_at not in", values, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtBetween(Date value1, Date value2) {
            addCriterion("ended_at between", value1, value2, "endedAt");
            return (Criteria) this;
        }

        public Criteria andEndedAtNotBetween(Date value1, Date value2) {
            addCriterion("ended_at not between", value1, value2, "endedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtIsNull() {
            addCriterion("local_started_at is null");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtIsNotNull() {
            addCriterion("local_started_at is not null");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtEqualTo(Date value) {
            addCriterion("local_started_at =", value, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtNotEqualTo(Date value) {
            addCriterion("local_started_at <>", value, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtGreaterThan(Date value) {
            addCriterion("local_started_at >", value, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("local_started_at >=", value, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtLessThan(Date value) {
            addCriterion("local_started_at <", value, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtLessThanOrEqualTo(Date value) {
            addCriterion("local_started_at <=", value, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtIn(List<Date> values) {
            addCriterion("local_started_at in", values, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtNotIn(List<Date> values) {
            addCriterion("local_started_at not in", values, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtBetween(Date value1, Date value2) {
            addCriterion("local_started_at between", value1, value2, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalStartedAtNotBetween(Date value1, Date value2) {
            addCriterion("local_started_at not between", value1, value2, "localStartedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtIsNull() {
            addCriterion("local_ended_at is null");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtIsNotNull() {
            addCriterion("local_ended_at is not null");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtEqualTo(Date value) {
            addCriterion("local_ended_at =", value, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtNotEqualTo(Date value) {
            addCriterion("local_ended_at <>", value, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtGreaterThan(Date value) {
            addCriterion("local_ended_at >", value, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("local_ended_at >=", value, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtLessThan(Date value) {
            addCriterion("local_ended_at <", value, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtLessThanOrEqualTo(Date value) {
            addCriterion("local_ended_at <=", value, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtIn(List<Date> values) {
            addCriterion("local_ended_at in", values, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtNotIn(List<Date> values) {
            addCriterion("local_ended_at not in", values, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtBetween(Date value1, Date value2) {
            addCriterion("local_ended_at between", value1, value2, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLocalEndedAtNotBetween(Date value1, Date value2) {
            addCriterion("local_ended_at not between", value1, value2, "localEndedAt");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andAbandonedIsNull() {
            addCriterion("abandoned is null");
            return (Criteria) this;
        }

        public Criteria andAbandonedIsNotNull() {
            addCriterion("abandoned is not null");
            return (Criteria) this;
        }

        public Criteria andAbandonedEqualTo(Boolean value) {
            addCriterion("abandoned =", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedNotEqualTo(Boolean value) {
            addCriterion("abandoned <>", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedGreaterThan(Boolean value) {
            addCriterion("abandoned >", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("abandoned >=", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedLessThan(Boolean value) {
            addCriterion("abandoned <", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedLessThanOrEqualTo(Boolean value) {
            addCriterion("abandoned <=", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedIn(List<Boolean> values) {
            addCriterion("abandoned in", values, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedNotIn(List<Boolean> values) {
            addCriterion("abandoned not in", values, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedBetween(Boolean value1, Boolean value2) {
            addCriterion("abandoned between", value1, value2, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("abandoned not between", value1, value2, "abandoned");
            return (Criteria) this;
        }

        public Criteria andManualIsNull() {
            addCriterion("manual is null");
            return (Criteria) this;
        }

        public Criteria andManualIsNotNull() {
            addCriterion("manual is not null");
            return (Criteria) this;
        }

        public Criteria andManualEqualTo(Boolean value) {
            addCriterion("manual =", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualNotEqualTo(Boolean value) {
            addCriterion("manual <>", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualGreaterThan(Boolean value) {
            addCriterion("manual >", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualGreaterThanOrEqualTo(Boolean value) {
            addCriterion("manual >=", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualLessThan(Boolean value) {
            addCriterion("manual <", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualLessThanOrEqualTo(Boolean value) {
            addCriterion("manual <=", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualIn(List<Boolean> values) {
            addCriterion("manual in", values, "manual");
            return (Criteria) this;
        }

        public Criteria andManualNotIn(List<Boolean> values) {
            addCriterion("manual not in", values, "manual");
            return (Criteria) this;
        }

        public Criteria andManualBetween(Boolean value1, Boolean value2) {
            addCriterion("manual between", value1, value2, "manual");
            return (Criteria) this;
        }

        public Criteria andManualNotBetween(Boolean value1, Boolean value2) {
            addCriterion("manual not between", value1, value2, "manual");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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