package ksyun.client.vpc.describevpntunnelipsecstatus.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeVpnTunnelIpsecStatusResponse @Description DescribeVpnTunnelIpsecStatus 返回体
 */
@Data
@ToString
public class DescribeVpnTunnelIpsecStatusResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
