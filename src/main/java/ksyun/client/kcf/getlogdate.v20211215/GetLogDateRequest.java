package ksyun.client.kcf.getlogdate.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetLogDateRequest
* @Description 请求参数
*/
@Data
public class GetLogDateRequest{
    /***/
    @KsYunField(name="id")
    private Integer Id;

}
