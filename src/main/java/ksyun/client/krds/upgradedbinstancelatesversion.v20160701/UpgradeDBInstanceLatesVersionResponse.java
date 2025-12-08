package ksyun.client.krds.upgradedbinstancelatesversion.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpgradeDBInstanceLatesVersionResponse
* @Description UpgradeDBInstanceLatesVersion 返回体
*/
@Data
@ToString
public class UpgradeDBInstanceLatesVersionResponse extends BaseResponseModel {
    /**返回操作实例详情*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Instances")
        private List<DataDtoInstancesDto> Instances;

        @Data
        @ToString
        public static class DataDtoInstancesDto {
            /***/
            @JsonProperty("DBInstanceClass")
            private DataDtoInstancesDtoDBInstanceClassDto DBInstanceClass;

            @Data
            @ToString
            public static class DataDtoInstancesDtoDBInstanceClassDto {
                /***/
                @JsonProperty("Id")
                private String Id;

                /***/
                @JsonProperty("Iops")
                private Integer Iops;

                /***/
                @JsonProperty("Vcpus")
                private Integer Vcpus;

                /***/
                @JsonProperty("Disk")
                private Integer Disk;

                /***/
                @JsonProperty("Ram")
                private Integer Ram;

                /***/
                @JsonProperty("Mem")
                private Integer Mem;

                /***/
                @JsonProperty("MaxConn")
                private Integer MaxConn;

            }

            /***/
            @JsonProperty("MiniVersion")
            private String MiniVersion;

            /***/
            @JsonProperty("DBInstanceIdentifier")
            private String DBInstanceIdentifier;

            /***/
            @JsonProperty("DBInstanceName")
            private String DBInstanceName;

            /***/
            @JsonProperty("DBInstanceStatus")
            private String DBInstanceStatus;

            /***/
            @JsonProperty("DBInstanceType")
            private String DBInstanceType;

            /***/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /***/
            @JsonProperty("PreferredBackupTime")
            private String PreferredBackupTime;

            /***/
            @JsonProperty("GroupId")
            private String GroupId;

            /***/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /***/
            @JsonProperty("Vip")
            private String Vip;

            /***/
            @JsonProperty("Port")
            private Integer Port;

            /***/
            @JsonProperty("Engine")
            private String Engine;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
