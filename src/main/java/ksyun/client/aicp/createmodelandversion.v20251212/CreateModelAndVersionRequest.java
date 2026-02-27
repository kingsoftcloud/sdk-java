package ksyun.client.aicp.createmodelandversion.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateModelAndVersionRequest
* @Description 请求参数
*/
@Data
public class CreateModelAndVersionRequest{
    /**模型名称*/
    @KsYunField(name="ModelName")
    private String ModelName;

    /**模型描述*/
    @KsYunField(name="ModelDescription")
    private String ModelDescription;

    /**模型版本名称*/
    @KsYunField(name="ModelVersionName")
    private String ModelVersionName;

    /**模型版本描述*/
    @KsYunField(name="ModelVersionDescription")
    private String ModelVersionDescription;

    /**来源类型，有效值：storage-config*/
    @KsYunField(name="SourceType")
    private String SourceType;

    /**存储配置ID*/
    @KsYunField(name="StorageConfigId")
    private String StorageConfigId;

    /**模型格式(有效值请参考DescribeFormatAndFrameworks)*/
    @KsYunField(name="Format")
    private String Format;

    /**模型框架(有效值请参考DescribeFormatAndFrameworks)*/
    @KsYunField(name="Framework")
    private String Framework;

    /**用户访问权限列表*/
    @KsYunField(name="Users",type=2)
    private List<UsersDto> UsersList;

    @Data
    @ToString
    public static class UsersDto {
        /**用户ID*/
        @KsYunField(name="UserId")
        private String UserId;

        /**模型权限，有效值：writer(管理员可读写), reader(普通用户只读)*/
        @KsYunField(name="Permission")
        private String Permission;

    }

}
