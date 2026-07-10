package ksyun.client.aicp.getapioverview.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetApiOverviewResponse
* @Description GetApiOverview 返回体
*/
@Data
@ToString
public class GetApiOverviewResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**API概览列表*/
    @JsonProperty("ApiOverviewList")
    private List<ApiOverviewListDto> ApiOverviewList;

    @Data
    @ToString
    public static class ApiOverviewListDto {
        /**服务名称*/
        @JsonProperty("ApiService")
        private String ApiService;

        /**API名称*/
        @JsonProperty("ApiName")
        private String ApiName;

        /**版本号*/
        @JsonProperty("ApiVersion")
        private String ApiVersion;

        /**API中文名称*/
        @JsonProperty("ApiNameCn")
        private String ApiNameCn;

        /**API描述*/
        @JsonProperty("ApiDescription")
        private String ApiDescription;

        /**API说明*/
        @JsonProperty("ApiInstructions")
        private String ApiInstructions;

        /**API分组*/
        @JsonProperty("ApiGroup")
        private String ApiGroup;

        /**API Explorer链接*/
        @JsonProperty("ApiExplorerUrl")
        private String ApiExplorerUrl;

        /**操作类型：Create / Update / Read / Delete等*/
        @JsonProperty("OperationType")
        private String OperationType;

    }

}
