package ksyun.client.kpfs.createmigratetask.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMigrateTaskRequest
* @Description 请求参数
*/
@Data
public class CreateMigrateTaskRequest{
    /**任务id（数据迁移规则ID）。*/
    @KsYunField(name="RuleId")
    private String RuleId;

    /**数据源存储下的相对路径（为数据迁移绑定关系中数据源存储目录或前缀下的相对路径）。若数据源存储为KS3，则限制为：1~1023个字符，不能包含"@"、".."、"@base@"和"@style@"，必须以/开头，不允许以/结尾。若数据源存储为KPFS，则必须以/开头，不允许以/结尾，且KPFS文件系统子目录要求必须存在。*/
    @KsYunField(name="SrcDirectory")
    private String SrcDirectory;

    /**数据目标存储下的相对路径（为数据迁移绑定关系中数据目标存储目录或前缀下的相对路径）。若数据目标存储为KS3，则限制为：1~1023个字符，不能包含"@"、".."、"@base@"和"@style@"，必须以/开头，不允许以/结尾。若数据目标存储为KPFS，则必须以/开头，不允许以/结尾，且KPFS文件系统子目录要求必须存在。*/
    @KsYunField(name="DstDirectory")
    private String DstDirectory;

    /**64KB，采用JSON格式。该参数仅数据源存储为KS3，数据目标存储为KPFS时支持。
若文件清单内存在源存储下不存在的文件，迁移时会忽略。
• 任务要同步的源数据为：BucketPrefix+SrcDirectory+EntryList
• 任务同步到目标的数据路径为：DirPath+DstDirectory+EntryList*/
    @KsYunField(name="EntryList",type=2)
    private List<String> EntryListList;

}
