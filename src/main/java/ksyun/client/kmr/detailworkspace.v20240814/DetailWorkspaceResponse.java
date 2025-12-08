package ksyun.client.kmr.detailworkspace.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DetailWorkspaceResponse
* @Description DetailWorkspace 返回体
*/
@Data
@ToString
public class DetailWorkspaceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Code")
    private Integer Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**工作空间ID*/
        @JsonProperty("WorkspaceId")
        private String WorkspaceId;

        /**工作空间名称*/
        @JsonProperty("WorkspaceName")
        private String WorkspaceName;

        /**工作空间状态*/
        @JsonProperty("Status")
        private String Status;

        /**工作空间计费方式
按量付费：hourlyVolume
包年包月：Monthly
*/
        @JsonProperty("PaymentType")
        private String PaymentType;

        /**工作空间创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**工作空间运行时间
单位：秒*/
        @JsonProperty("RunningTime")
        private Integer RunningTime;

        /**用户账号ID*/
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
计费类型为包年包月时：ON为开启；
		    OFF为未开启*/
        @JsonProperty("ElasticResourceStatus")
        private String ElasticResourceStatus;

        /**计算单元CU配置
1:4 ：1CU = 1核CPU+4GiB内存
1:8 ：1CU = 1核CPU+8GiB内存*/
        @JsonProperty("ComputeUnit")
        private String ComputeUnit;

        /**HistoryServer的url
可查看工作空间内Spark作业的运行详情*/
        @JsonProperty("HistoryServer")
        private String HistoryServer;

        /**工作空间已分配资源规格
单位：CU*/
        @JsonProperty("AllocatedResources")
        private Integer AllocatedResources;

        /**服务地址入口*/
        @JsonProperty("EndPoint")
        private String EndPoint;

        /**工作空间已使用资源
单位：CU*/
        @JsonProperty("UsedResources")
        private Integer UsedResources;

        /**工作空间瞬时资源上限
单位：CU*/
        @JsonProperty("MaxCu")
        private Integer MaxCu;

        /**工作空间瞬时资源上限最小值
单位：CU*/
        @JsonProperty("MinCu")
        private Integer MinCu;

        /**工作空间中是否有已提交或运行中的作业
*/
        @JsonProperty("RunningJob")
        private Boolean RunningJob;

        /**Spark作业监控链接
*/
        @JsonProperty("GrafanaDashboard")
        private String GrafanaDashboard;

        /**Flink HistoryServer链接
可查看工作空间内Flik作业的运行情况

*/
        @JsonProperty("FlinkHistoryServer")
        private String FlinkHistoryServer;

        /**Flink作业监控链接*/
        @JsonProperty("FlinkGrafanaDashboard")
        private String FlinkGrafanaDashboard;

    }

}
