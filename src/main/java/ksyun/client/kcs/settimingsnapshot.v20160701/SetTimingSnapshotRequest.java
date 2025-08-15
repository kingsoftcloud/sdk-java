package ksyun.client.kcs.settimingsnapshot.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetTimingSnapshotRequest @Description 请求参数
 */
@Data
public class SetTimingSnapshotRequest {
  /** 可用区 默认：对应机房的a区 */
  @KsYunField(name = "AvailableZone")
  private String AvailableZone;

  /** 备份开关 On/Off：开/关 */
  @KsYunField(name = "TimingSwitch")
  private String TimingSwitch;

  /** 缓存服务ID 缓存服务ID */
  @KsYunField(name = "CacheId")
  private String CacheId;

  /** 时段 TimingSwitch=On时，该项必填，参照请见－[自动备份的时间格式](https://docs.ksyun.com/documents/38478) */
  @KsYunField(name = "Timezone")
  private String Timezone;

  /** 是否进行大key分析，默认false */
  @KsYunField(name = "Bigkey")
  private Boolean Bigkey;
}
