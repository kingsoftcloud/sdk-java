package ksyun.client.epc.cancelimageexport.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CancelImageExportRequest
* @Description 请求参数
*/
@Data
public class CancelImageExportRequest{
    /***/
    @KsYunField(name="ImageId")
    private String ImageId;


}