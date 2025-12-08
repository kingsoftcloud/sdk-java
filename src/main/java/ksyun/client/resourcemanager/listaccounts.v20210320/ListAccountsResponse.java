package ksyun.client.resourcemanager.listaccounts.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAccountsResponse
* @Description ListAccounts 返回体
*/
@Data
@ToString
public class ListAccountsResponse extends BaseResponseModel {
    /**成员列表*/
    @JsonProperty("Accounts")
    private List<AccountsDto> Accounts;

    @Data
    @ToString
    public static class AccountsDto {
        /**成员UID*/
        @JsonProperty("AccountId")
        private Integer AccountId;

        /**成员用户名*/
        @JsonProperty("AccountName")
        private String AccountName;

        /**成员显示名称*/
        @JsonProperty("DisplayName")
        private String DisplayName;

        /**成员类型*/
        @JsonProperty("Type")
        private String Type;

        /**成员加入时间*/
        @JsonProperty("JoinedTime")
        private String JoinedTime;

    }

    /**分页信息*/
    @JsonProperty("Pagination")
    private PaginationDto Pagination;

    @Data
    @ToString
    public static class PaginationDto {
        /**成员总数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /**当前页码*/
        @JsonProperty("PageNumber")
        private String PageNumber;

        /**当前每页展示多少条*/
        @JsonProperty("PageSize")
        private String PageSize;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
