package ksyun.client.epc.deleteshareimage.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteShareImageRequest
* @Description 请求参数
*/
@Data
public class DeleteShareImageRequest{
    /**需要取消共享的镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**接收共享镜像的账号ID列表*/
    @KsYunField(name="AccountId",type=1)
    private List<String> AccountIdList;

}
