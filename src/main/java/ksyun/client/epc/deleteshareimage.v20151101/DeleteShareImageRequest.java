package ksyun.client.epc.deleteshareimage.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteShareImageRequest
 * @Description 请求参数
 */
@Data
public class DeleteShareImageRequest {
    /**
     * 需要取消共享的镜像ID
     */
    @KsYunField(name = "ImageId")
    private String ImageId;

    /**
     * 接收共享镜像的账号ID列表
     */
    @KsYunField(name = "AccountId.N")
    private String AccountIdN;


}