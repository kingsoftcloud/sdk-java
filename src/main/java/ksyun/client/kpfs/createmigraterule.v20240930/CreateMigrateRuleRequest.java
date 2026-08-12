package ksyun.client.kpfs.createmigraterule.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMigrateRuleRequest
* @Description 请求参数
*/
@Data
public class CreateMigrateRuleRequest{
    /**数据迁移名称，最大64字符。*/
    @KsYunField(name="Name")
    private String Name;

    /**地域信息。*/
    @KsYunField(name="Region")
    private String Region;

    /**数据源存储。数据源存储与数据目标存储必须在相同Region。*/
    @KsYunField(name="SrcData")
    private SrcDataDto SrcData;

    @Data
    @ToString
    public static class SrcDataDto {
        /**数据源存储类型，支持KS3、KPFS。*/
        @KsYunField(name="StorageType")
        private String StorageType;

        /**若为KPFS，则代表KPFS文件系统ID。*/
        @KsYunField(name="FileSystemId")
        private String FileSystemId;

        /**若为KPFS，则为KPFS文件系统目录完整绝对路径。若不设置，默认/，代表整个文件系统。必须以/开头，不允许以/结尾。KPFS文件系统目录要求必须存在，且不能与其它数据迁移规则存在重复。*/
        @KsYunField(name="DirPath")
        private String DirPath;

        /**KS3 Bucket名称，必须与KPFS实例在相同地域，3~63个字符，只能包含小写字母、数字和连字符（-），且不能以连字符（-）开头或结尾。*/
        @KsYunField(name="BucketName")
        private String BucketName;

        /**KS3 Bucket前缀。若不设置，代表整个存储桶。1~1023个字符，不能包含"@"、".."、"@base@"和"@style@"。KS3存储桶前缀不能与其它数据迁移规则存在重复。*/
        @KsYunField(name="BucketPrefix")
        private String BucketPrefix;

    }

    /**数据目标存储。数据源存储与数据目标存储必须在相同Region。*/
    @KsYunField(name="DstData")
    private DstDataDto DstData;

    @Data
    @ToString
    public static class DstDataDto {
        /**数据源存储类型，支持KS3、KPFS。*/
        @KsYunField(name="StorageType")
        private String StorageType;

        /**若为KPFS，则代表KPFS文件系统ID。*/
        @KsYunField(name="FileSystemId")
        private String FileSystemId;

        /**若为KPFS，则为KPFS文件系统目录完整绝对路径。若不设置，默认/，代表整个文件系统。必须以/开头，不允许以/结尾。KPFS文件系统目录要求必须存在，且不能与其它数据迁移规则存在重复。*/
        @KsYunField(name="DirPath")
        private String DirPath;

        /**KS3 Bucket名称，必须与KPFS实例在相同地域，3~63个字符，只能包含小写字母、数字和连字符（-），且不能以连字符（-）开头或结尾。*/
        @KsYunField(name="BucketName")
        private String BucketName;

        /**KS3 Bucket前缀。若不设置，代表整个存储桶。1~1023个字符，不能包含"@"、".."、"@base@"和"@style@"。KS3存储桶前缀不能与其它数据迁移规则存在重复。*/
        @KsYunField(name="BucketPrefix")
        private String BucketPrefix;

    }

}
