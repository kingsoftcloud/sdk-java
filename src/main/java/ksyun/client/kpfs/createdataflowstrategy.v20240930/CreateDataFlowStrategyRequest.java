package ksyun.client.kpfs.createdataflowstrategy.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDataFlowStrategyRequest
* @Description 请求参数
*/
@Data
public class CreateDataFlowStrategyRequest{
    /**文件系统ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动策略名称，最大64字符。*/
    @KsYunField(name="StrategyName")
    private String StrategyName;

    /**数据流动策略类型
• 若为KPFS-P1存储池类型，有效值：import 导入。
• 若为KPFS-P2存储池类型，有效值：import 导入、export 导出。*/
    @KsYunField(name="StrategyType")
    private String StrategyType;

    /**数据流动是否启用绑定目录关系，启用绑定目录关系后文件侧的文件会和对象侧的文件进行关联，可以支持仅元数据加载、订阅模式。仅KPFS-P1存储池类型支持。
• false：默认值，表示禁用。
• true：启用绑定目录关系。*/
    @KsYunField(name="Bind")
    private String Bind;

    /**数据导入加载模式，仅import导入策略可设置。
• 若为KPFS-P1存储池类型，有效值
    ◦ data_and_metadata - 元数据+数据加载。
    ◦ metadata_only - 仅元数据加载。仅当Bind为true时可支持。
• 若为KPFS-P2存储池类型，有效值
    ◦ demand - 按需加载（即仅元数据加载）。
    ◦ preload-预加载（即元数据+数据加载）。*/
    @KsYunField(name="DataLoadingMode")
    private String DataLoadingMode;

    /**文件系统目录完整绝对路径，若不设置，则代表整个文件系统。
• 支持中英文字母、特殊字符不做限制，且不允许出现连续的/，必须以/开头和结尾。
• KPFS文件系统目录不能与其它导入策略存在重复。
• KPFS文件系统目录要求必须存在。
• 当Bind为true时，目录必须为空，且不能与其他导入策略的目录存在嵌套（如/dir/、/dir/subdir）。*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**KS3 Bucket名称，必须与KPFS实例在相同地域，3~63个字符，只能包含小写字母、数字和连字符（-），且不能以连字符（-）开头或结尾。*/
    @KsYunField(name="Bucket")
    private String Bucket;

    /**KS3 Bucket前缀，若不设置，则代表整个存储桶。
• 1~1023个字符，不能包含"@"、“..”"@base@"和"@style@"。
• KS3存储桶前缀不能与其它任务存在重复。*/
    @KsYunField(name="BucketPrefix")
    private String BucketPrefix;

    /**同名文件处理方式。仅KPFS-P1存储池类型支持。
• skip：跳过，默认值。
• overwrite：覆盖。
• diff：比较，保留最后修改时间最新的文件。*/
    @KsYunField(name="DuplicateProcess")
    private String DuplicateProcess;

    /**是否立即订阅。仅当Bind为true时可支持。仅KPFS-P1存储池类型支持。
• cancel：默认值，表示取消订阅。
• activate：表示开启订阅。*/
    @KsYunField(name="Subscribe")
    private String Subscribe;

    /**导出完成后，是否删除源的数据，仅export导出策略可设置。仅KPFS-P2存储池类型支持。
• true：删除数据
• false：不删除，默认值。*/
    @KsYunField(name="CleanSourceFile")
    private Boolean CleanSourceFile;

    /**导入/导出任务的执行速率，仅KPFS-P2存储池类型支持。
• low：业务优先，默认值。
• mid：均衡。
• high：导入优先。*/
    @KsYunField(name="BandWidthLimit")
    private String BandWidthLimit;

    /**数据流动导出策略的过滤规则，仅export导出策略可设置。仅KPFS-P2存储池类型支持。默认值0，有效值0-365。*/
    @KsYunField(name="ArchiveRule")
    private Integer ArchiveRule;

}
