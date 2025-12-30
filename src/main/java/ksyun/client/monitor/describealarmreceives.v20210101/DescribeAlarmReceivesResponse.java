package ksyun.client.monitor.describealarmreceives.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAlarmReceivesResponse
* @Description DescribeAlarmReceives 返回体
*/
@Data
@ToString
public class DescribeAlarmReceivesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
    }

    /**告警联系人或联系组列表*/
    @JsonProperty("contactInfoList")
    private List<ContactInfoListDto> ContactInfoList;

    @Data
    @ToString
    public static class ContactInfoListDto {
        /**告警联系人ID或告警联系组ID*/
        @JsonProperty("contactId")
        private Integer ContactId;

        /**告警联系人/告警联系组名称*/
        @JsonProperty("contactName")
        private String ContactName;

        /**告警通知方式。取值：
- 1: 发送邮件
- 2: 发送短信
- 3: 发送邮件和短信*/
        @JsonProperty("contactWay")
        private Integer ContactWay;

        /**告警联系人类型。取值：
- 1: 联系组
- 2: 联系人
*/
        @JsonProperty("contactFlag")
        private Integer ContactFlag;

    }

    /**总记录数*/
    @JsonProperty("totalCount")
    private Integer TotalCount;

    /**请求ID。*/
    @JsonProperty("requestId")
    private String RequestId;

}
