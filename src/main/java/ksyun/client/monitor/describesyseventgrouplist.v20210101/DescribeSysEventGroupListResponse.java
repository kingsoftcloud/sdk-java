package ksyun.client.monitor.describesyseventgrouplist.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeSysEventGroupListResponse
 * @Description DescribeSysEventGroupList 返回体
 */
@Data
@ToString
public class DescribeSysEventGroupListResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
