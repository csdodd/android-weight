package net.colindodd.weight.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.Calendar;

@Entity
public class Reading {

    @Id
    private long timestamp;

    @NotNull
    private Long weightId;

    @ToOne(joinProperty = "weightId")
    private Weight weight;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1387097782)
    private transient ReadingDao myDao;

    @Generated(hash = 1298356021)
    public Reading(long timestamp, @NotNull Long weightId) {
        this.timestamp = timestamp;
        this.weightId = weightId;
    }

    @Generated(hash = 1633136157)
    public Reading() {
    }

    public Reading generateTimestamp() {
        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int day = calendar.get(Calendar.DAY_OF_YEAR);

        final long timestamp = (year * 365) + day;
        setTimestamp(timestamp);
        return this;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getWeightId() {
        return this.weightId;
    }

    public void setWeightId(Long weightId) {
        this.weightId = weightId;
    }

    @Generated(hash = 1713090189)
    private transient Long weight__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 567647267)
    public Weight getWeight() {
        Long __key = this.weightId;
        if (weight__resolvedKey == null || !weight__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            WeightDao targetDao = daoSession.getWeightDao();
            Weight weightNew = targetDao.load(__key);
            synchronized (this) {
                weight = weightNew;
                weight__resolvedKey = __key;
            }
        }
        return weight;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1620813245)
    public void setWeight(@NotNull Weight weight) {
        if (weight == null) {
            throw new DaoException(
                    "To-one property 'weightId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.weight = weight;
            weightId = weight.getId();
            weight__resolvedKey = weightId;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 539256992)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getReadingDao() : null;
    }
}