package ksyun.client.kpfs.createdataflowtask.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDataFlowTaskRequest
* @Description 请求参数
*/
@Data
public class CreateDataFlowTaskRequest{
    /**数据流动ID。*/
    @KsYunField(name="DataFlowId")
    private String DataFlowId;

    /**数据流动任务类型，当前仅支持import。import：将KS3 Bucket的BucketPrefix下数据导入至KPFS DirPath下。*/
    @KsYunField(name="TaskAction")
    private String TaskAction;

    /**数据的源目录，为数据流动绑定关系中BucketPrefix下的相对路径。• 1~1023个字符，不能包含"@"、“..”"@base@"和"@style@"，必须以/开头，不允许以/结尾。*/
    @KsYunField(name="SrcDirectory")
    private String SrcDirectory;

    /**数据的目标目录，为数据流动绑定关系中DirPath下的相对路径。
• 必须以/开头，不允许以/结尾。
• KPFS文件系统子目录要求必须存在。*/
    @KsYunField(name="DstDirectory")
    private String DstDirectory;

    /**数据流动任务执行源目录下的文件清单，一个元素代表一个文件名称，限制单次调用最多64KB，采用JSON格式。若文件清单内存在源目录下不存在的文件，迁移时会忽略。任务要同步的源数据为：BucketPrefix+SrcDirectory+EntryList；任务同步到目标的数据路径为：DirPath+DstDirectory+EntryList*/
    @KsYunField(name="EntryList",type=2)
    private List<String> EntryListList;

    /**数据流动任务带宽上限。带宽：MB/s，默认300MB/s。取值范围：300-1500MB/s。*/
    @KsYunField(name="Bandwidth")
    private Integer Bandwidth;

}
