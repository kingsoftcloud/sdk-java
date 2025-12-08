package ksyun.client.kmr.listworkspaces.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListWorkspacesResponse
* @Description ListWorkspaces 返回体
*/
@Data
@ToString
public class ListWorkspacesResponse extends BaseResponseModel {
    /**响应状态码*/
    @JsonProperty("Code")
    private Integer Code;

    /**响应消息*/
    @JsonProperty("Message")
    private String Message;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**本次请求返回的记录数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("Workspaces")
        private List<DataDtoWorkspacesDto> Workspaces;

        @Data
        @ToString
        public static class DataDtoWorkspacesDto {
            /**工作空间ID*/
            @JsonProperty("WorkspaceId")
            private String WorkspaceId;

            /**工作空间名称*/
            @JsonProperty("WorkspaceName")
            private String WorkspaceName;

            /**工作空间状态
- STARTING：启动中
- FAILED：启动失败
- RUNNING：运行中
- TERMINATED：已删除
- TERMINATING：删除中
*/
            @JsonProperty("Status")
            private String Status;

            /**工作空间计费方式
- hourlyVolume：按量付费
- Monthly：包年包月*/
            @JsonProperty("PaymentType")
            private String PaymentType;

            /**工作空间创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**工作空间运行时间
单位：秒*/
            @JsonProperty("RunningTime")
            private Integer RunningTime;

            /**用户账户ID*/
            @JsonProperty("AccountId")
            private String AccountId;

            /**数据中心*/
            @JsonProperty("Region")
            private String Region;

            /**工作空间总资源规格
单位：CU*/
            @JsonProperty("ResourceSpec")
            private Integer ResourceSpec;

            /**包年包月资源规格
单位：CU*/
            @JsonProperty("FixedResourceSpec")
            private Integer FixedResourceSpec;

            /**弹性容量规格
单位：CU*/
            @JsonProperty("ElasticResourceSpec")
            private Integer ElasticResourceSpec;

            /**弹性容量实例ID*/
            @JsonProperty("ElasticResourceInstanceId")
            private String ElasticResourceInstanceId;

            /**弹性容量状态。
计费类型为按量付费时：OFF
计费类型为包年包月时：ON为开启
OFF为未开启。*/
            @JsonProperty("ElasticResourceStatus")
            private String ElasticResourceStatus;

            /**计算单元CU配置
1:4 ：1CU = 1核CPU+4GiB内存
1:8 ：1CU = 1核CPU+8GiB内存*/
            @JsonProperty("ComputeUnit")
            private String ComputeUnit;

            /**HistoryServer链接地址
可查看工作空间作业运行详情*/
            @JsonProperty("HistoryServer")
            private String HistoryServer;

            /**工作空间已分配资源规格
单位：CU*/
            @JsonProperty("AllocatedResources")
            private Integer AllocatedResources;

        }

    }

}
