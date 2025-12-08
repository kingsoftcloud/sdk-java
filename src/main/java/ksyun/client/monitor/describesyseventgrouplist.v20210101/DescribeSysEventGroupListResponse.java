package ksyun.client.monitor.describesyseventgrouplist.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSysEventGroupListResponse
* @Description DescribeSysEventGroupList 返回体
*/
@Data
@ToString
public class DescribeSysEventGroupListResponse extends BaseResponseModel {
    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("code")
    private String Code;

    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("sysEventGroupList")
    private List<SysEventGroupListDto> SysEventGroupList;

    @Data
    @ToString
    public static class SysEventGroupListDto {
        /***/
        @JsonProperty("instanceId")
        private String InstanceId;

        /***/
        @JsonProperty("groupId")
        private String GroupId;

        /***/
        @JsonProperty("producttype")
        private Integer Producttype;

        /***/
        @JsonProperty("eventName")
        private String EventName;

        /***/
        @JsonProperty("status")
        private String Status;

        /***/
        @JsonProperty("createdAt")
        private Integer CreatedAt;

        /***/
        @JsonProperty("updateAt")
        private Integer UpdateAt;

        /***/
        @JsonProperty("planAt")
        private Integer PlanAt;

        /***/
        @JsonProperty("finishAt")
        private Integer FinishAt;

        /***/
        @JsonProperty("deadline")
        private Integer Deadline;

    }

    /***/
    @JsonProperty("totalCount")
    private Integer TotalCount;

}
