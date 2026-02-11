package ksyun.client.kpfs.createdataflow.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDataFlowRequest
* @Description 请求参数
*/
@Data
public class CreateDataFlowRequest{
    /**数据流动名称，最大64字符。*/
    @KsYunField(name="Name")
    private String Name;

    /**KPFS文件系统ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**KPFS文件系统目录完整绝对路径。• 若不设置，默认/，代表整个文件系统。必须以/开头，不允许以/结尾。• KPFS文件系统目录要求必须存在。• KPFS文件系统目录不能与其它数据流动规则存在重复。*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**KS3 Bucket名称，必须与KPFS实例在相同地域，3~63个字符，只能包含小写字母、数字和连字符（-），且不能以连字符（-）开头或结尾。*/
    @KsYunField(name="Bucket")
    private String Bucket;

    /**KS3 Bucket前缀。• 若不设置，代表整个存储桶。• 1~1023个字符，不能包含"@"、“..”"@base@"和"@style@"。• KS3存储桶前缀不能与其它数据流动规则存在重复。*/
    @KsYunField(name="BucketPrefix")
    private String BucketPrefix;

    /**描述信息。*/
    @KsYunField(name="Description")
    private String Description;

}
