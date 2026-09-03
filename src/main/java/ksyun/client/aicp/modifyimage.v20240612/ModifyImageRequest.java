package ksyun.client.aicp.modifyimage.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyImageRequest
* @Description 请求参数
*/
@Data
public class ModifyImageRequest{
    /**自定义镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**镜像名称*/
    @KsYunField(name="ImageName")
    private String ImageName;

    /**镜像权限，枚举值：
- Public，公开可见
- Private，仅自己可见
- Specified，指定范围。不传表示不修改*/
    @KsYunField(name="ImagePermission")
    private String ImagePermission;

    /**用户权限列表（若传入，会进行全量覆盖式修改）*/
    @KsYunField(name="AccessList",type=2)
    private List<AccessListDto> AccessListList;

    @Data
    @ToString
    public static class AccessListDto {
        /**子账号ID*/
        @KsYunField(name="UserId")
        private String UserId;

        /**用户权限，枚举值：
- writer，管理员
- reader，普通成员*/
        @KsYunField(name="Permission")
        private String Permission;

    }

    /**权限组共享列表（若传入，会进行全量覆盖式修改）*/
    @KsYunField(name="SharedGroupList",type=2)
    private List<SharedGroupListDto> SharedGroupListList;

    @Data
    @ToString
    public static class SharedGroupListDto {
        /**权限组ID*/
        @KsYunField(name="AccessGroupId")
        private String AccessGroupId;

        /**权限组共享角色，枚举值：
- writer，管理员
- reader，普通成员*/
        @KsYunField(name="Permission")
        private String Permission;

    }

}
