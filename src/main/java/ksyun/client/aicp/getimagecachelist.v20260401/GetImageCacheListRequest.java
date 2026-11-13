package ksyun.client.aicp.getimagecachelist.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetImageCacheListRequest
* @Description 请求参数
*/
@Data
public class GetImageCacheListRequest{
    /**列表范围：custom（自定义镜像缓存）或 public（公共镜像目录）*/
    @KsYunField(name="Scope")
    private String Scope;

    /**按镜像缓存ID进行包含式模糊查询*/
    @KsYunField(name="ImageCacheId")
    private String ImageCacheId;

    /**按镜像地址过滤*/
    @KsYunField(name="Image")
    private String Image;

    /**按镜像描述进行包含式模糊查询*/
    @KsYunField(name="Description")
    private String Description;

    /**按镜像缓存状态过滤（底层暂不支持，待支持后生效）*/
    @KsYunField(name="Status")
    private String Status;

    /**页码，从1开始*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**每页数量，范围1-100*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
