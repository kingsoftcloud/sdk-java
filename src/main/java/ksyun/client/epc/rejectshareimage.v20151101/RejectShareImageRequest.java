package ksyun.client.epc.rejectshareimage.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RejectShareImageRequest
* @Description 请求参数
*/
@Data
public class RejectShareImageRequest{
    /***/
    @KsYunField(name="ImageId")
    private String ImageId;


}