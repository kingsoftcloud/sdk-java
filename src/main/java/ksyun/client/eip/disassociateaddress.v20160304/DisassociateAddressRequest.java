package ksyun.client.eip.disassociateaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DisassociateAddressRequest
 * @Description 请求参数
 */
@Data
public class DisassociateAddressRequest {
    /**
     * 弹性IP的ID
     */
    @KsYunField(name = "AllocationId")
    private String AllocationId;

}