package com.mingshashan.note.repository.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Objects;

/**
 *
 */
public class LocalDateTimeTypeHandler implements TypeHandler<LocalDateTime> {

    /**
     * 保存时LocalDate转换为Date
     */
    @Override
    public void setParameter(PreparedStatement ps, int i, LocalDateTime localDateTime, JdbcType jdbcType) throws SQLException {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        //LocalDate转换成util.Date
        Date date = Date.from(zdt.toInstant());
        //util.date转换成sql.date
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        ps.setDate(i, sqlDate);
    }

    /**
     * 查询结果Date转换成LocalDateTime
     */
    @Override
    public LocalDateTime getResult(ResultSet rs, String columnName) throws SQLException {
        java.sql.Timestamp sqlDate = rs.getTimestamp(columnName);
        if (Objects.isNull(sqlDate)) {
            return null;
        }
        Date date = new Date(sqlDate.getTime());
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        // atZone()方法返回在指定时区从此Instant生成的ZonedDateTime。
        return instant.atZone(zoneId).toLocalDateTime();
    }

    /**
     * 查询结果Date转换成LocalDateTime
     */
    @Override
    public LocalDateTime getResult(ResultSet rs, int columnIndex) throws SQLException {
        java.sql.Timestamp sqlDate = rs.getTimestamp(columnIndex);
        if (Objects.isNull(sqlDate)) {
            return null;
        }
        Date date = new Date(sqlDate.getTime());
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        return instant.atZone(zoneId).toLocalDateTime();
    }

    @Override
    public LocalDateTime getResult(CallableStatement cs, int columnIndex) throws SQLException {
        java.sql.Timestamp sqlDate = cs.getTimestamp(columnIndex);
        if (Objects.isNull(sqlDate)) {
            return null;
        }
        Date date = new Date(sqlDate.getTime());
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        return instant.atZone(zoneId).toLocalDateTime();
    }
}