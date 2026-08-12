package ksyun.client.kpfs.describedataflowstrategylist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataFlowStrategyListResponse
* @Description DescribeDataFlowStrategyList 返回体
*/
@Data
@ToString
public class DescribeDataFlowStrategyListResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页大小。默认为10。取值范围1-1000。*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**页码。默认为1。*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**总个数。*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**数据流动策略列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据流动策略类型。
• 若为KPFS-P1存储池类型，有效值：import 导入。
• 若为KPFS-P2存储池类型，有效值：import 导入、export 导出。*/
        @JsonProperty("StrategyType")
        private String StrategyType;

        /**数据流动是否启用绑定目录关系，启用绑定目录关系后文件侧的文件会和对象侧的文件进行关联，可以支持仅元数据加载、订阅模式。仅KPFS-P1存储池类型支持。
• false：默认值，表示不启用。
• true：启用绑定目录关系。*/
        @JsonProperty("Bind")
        private String Bind;

        /**数据流动策略ID。*/
        @JsonProperty("StrategyId")
        private String StrategyId;

        /**数据导入加载模式：
• 若为KPFS-P1存储池类型，有效值
◦ data_and_metadata - 元数据+数据加载。
◦ metadata_only - 仅元数据加载。仅当Bind为true时可支持。
• 若为KPFS-P2存储池类型，有效值
◦ demand - 按需加载（即仅元数据加载）。
◦ preload-预加载（即元数据+数据加载）。*/
        @JsonProperty("DataLoadingMode")
        private String DataLoadingMode;

        /**数据流动策略名称，最大255字符。*/
        @JsonProperty("StrategyName")
        private String StrategyName;

        /**文件系统ID。*/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /**文件系统目录完整绝对路径，若不设置，则代表整个文件系统。*/
        @JsonProperty("DirPath")
        private String DirPath;

        /**KS3 Bucket名称。*/
        @JsonProperty("Bucket")
        private String Bucket;

        /**KS3 Bucket前缀，若不设置，则代表整个存储桶。*/
        @JsonProperty("BucketPrefix")
        private String BucketPrefix;

        /**同名文件处理方式。仅KPFS-P1存储池类型支持。
• skip：跳过，默认值。
• overwrite：覆盖。
• diff：比较，保留最后修改时间最新的文件。*/
        @JsonProperty("DuplicateProcess")
        private String DuplicateProcess;

        /**订阅状态，仅当Bind为true时可支持。仅KPFS-P1存储池类型支持。
• to_be_subscribed - 待订阅。
• subscribing-订阅中。*/
        @JsonProperty("Subscribe")
        private String Subscribe;

        /**数据流动策略状态，支持两种：
• 运行中：running
• 未运行：norunning*/
        @JsonProperty("Status")
        private String Status;

        /**策略更新时间。仅KPFS-P2存储池类型支持。*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**导出完成后，是否删除源的数据，仅export导出策略可设置。仅KPFS-P2存储池类型支持。
• true：删除数据。
• false：不删除。*/
        @JsonProperty("CleanSourceFile")
        private Boolean CleanSourceFile;

        /**导入/导出任务的执行速率，仅KPFS-P2存储池类型支持。
• low：业务优先。
• mid：均衡。
• high：导入优先。*/
        @JsonProperty("BandWidthLimit")
        private String BandWidthLimit;

        /**数据流动导出策略的过滤规则，仅export导出策略可设置。仅KPFS-P2存储池类型支持。有效值0-365。*/
        @JsonProperty("ArchiveRule")
        private String ArchiveRule;

        /**策略创建时间。仅KPFS-P2存储池类型支持。*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
