package ksyun.client.krds.describebackupoverview.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeBackupOverviewResponse
 * @Description DescribeBackupOverview 返回体
 */
@Data
@ToString
public class DescribeBackupOverviewResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
