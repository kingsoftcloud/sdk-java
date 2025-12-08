package ksyun.client.krds.describeengineparametersmodifyhistory.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEngineParametersModifyHistoryResponse
* @Description DescribeEngineParametersModifyHistory 返回体
*/
@Data
@ToString
public class DescribeEngineParametersModifyHistoryResponse extends BaseResponseModel {
    /**当前查询条件下总条数	
查询总条数*/
    @JsonProperty("total_count")
    private Integer Total_count;

    /**请求ID	
请求标识*/
    @JsonProperty("request_id")
    private String Request_id;

    /**查询记录
	查询记录*/
    @JsonProperty("history")
    private List<HistoryDto> History;

    @Data
    @ToString
    public static class HistoryDto {
        /**请求ID	
请求标识*/
        @JsonProperty("id")
        private String Id;

        /**变更参数名称	
变更参数名称*/
        @JsonProperty("configuration_key")
        private String Configuration_key;

        /**参数原值	
参数原值*/
        @JsonProperty("old_value")
        private String Old_value;

        /**参数变更后现值
参数变更后现值*/
        @JsonProperty("new_value")
        private String New_value;

        /**创建时间	
创建时间*/
        @JsonProperty("created")
        private String Created;

    }

}
