package org.apache.hadoop.hbase

object PartitionerType extends Enumeration {
  type PartitionerType = Value

  val SaltPartitioner, DefaultPartitioner = Value
}

