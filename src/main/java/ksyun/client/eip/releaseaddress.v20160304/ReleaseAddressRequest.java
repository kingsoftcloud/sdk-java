package ksyun.client.eip.releaseaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReleaseAddressRequest
* @Description 请求参数
*/
@Data
public class ReleaseAddressRequest{
    /**弹性IP的ID*/
    @KsYunField(name="AllocationId")
    private String AllocationId;


}