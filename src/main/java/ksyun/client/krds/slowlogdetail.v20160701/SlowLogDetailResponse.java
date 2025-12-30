package ksyun.client.krds.slowlogdetail.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SlowLogDetailResponse
* @Description SlowLogDetail 返回体
*/
@Data
@ToString
public class SlowLogDetailResponse extends BaseResponseModel {

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("id")
        private String Id;

        /**执行完成时间*/
        @JsonProperty("sqlExecTimeStamp")
        private String SqlExecTimeStamp;

        /**聚合时间*/
        @JsonProperty("aggTime")
        private String AggTime;

        /**认证用户*/
        @JsonProperty("authUser")
        private String AuthUser;

        /**当前用户、数据库用户*/
        @JsonProperty("currentUser")
        private String CurrentUser;

        /**主机名*/
        @JsonProperty("hostname")
        private String Hostname;

        /**执行耗时*/
        @JsonProperty("queryTime")
        private String QueryTime;

        /**锁等待时间*/
        @JsonProperty("lockTime")
        private String LockTime;

        /**返回行*/
        @JsonProperty("rowsSent")
        private String RowsSent;

        /**检查行*/
        @JsonProperty("rowsExamined")
        private String RowsExamined;

        /**SQL语句*/
        @JsonProperty("sqlContent")
        private String SqlContent;

        /**线程ID*/
        @JsonProperty("threadId")
        private String ThreadId;

        /**产品ID*/
        @JsonProperty("productId")
        private String ProductId;

        /**租户Id*/
        @JsonProperty("tenantId")
        private String TenantId;

        /**检查/聚合ID*/
        @JsonProperty("checksum")
        private String Checksum;

        /**聚合模板*/
        @JsonProperty("fingerprint")
        private String Fingerprint;

    }

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

}
