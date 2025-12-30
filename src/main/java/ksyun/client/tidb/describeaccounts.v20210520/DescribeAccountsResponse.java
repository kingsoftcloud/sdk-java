package ksyun.client.tidb.describeaccounts.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAccountsResponse
* @Description DescribeAccounts 返回体
*/
@Data
@ToString
public class DescribeAccountsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**账户名称*/
        @JsonProperty("AccountName")
        private String AccountName;

        /**账户类型：管理员、普通用户

admin：管理员
normal：普通用户*/
        @JsonProperty("AccountType")
        private String AccountType;

        /**账户描述*/
        @JsonProperty("Describe")
        private String Describe;

        /**权限集合*/
        @JsonProperty("Privileges")
        private DataPrivilegesDto Privileges;

        @Data
        @ToString
        public static class DataPrivilegesDto {
            /**ALL表示所有数据库(仅管理员用户)，
普通用户可到单个库的权限；

readOnly:只读
readWrite:只写
onlyDdl:只DDL
onlyDml:只DML*/
            @JsonProperty("ALL")
            private String ALL;

        }

    }

}
