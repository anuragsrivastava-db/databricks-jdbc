/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * <p>DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.databricks.jdbc.model.client.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(
    value = "Autogenerated by Thrift Compiler (0.19.0)",
    date = "2025-05-08")
public class TFetchResultsResp
    implements org.apache.thrift.TBase<TFetchResultsResp, TFetchResultsResp._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<TFetchResultsResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
      new org.apache.thrift.protocol.TStruct("TFetchResultsResp");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "status", org.apache.thrift.protocol.TType.STRUCT, (short) 1);
  private static final org.apache.thrift.protocol.TField HAS_MORE_ROWS_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "hasMoreRows", org.apache.thrift.protocol.TType.BOOL, (short) 2);
  private static final org.apache.thrift.protocol.TField RESULTS_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "results", org.apache.thrift.protocol.TType.STRUCT, (short) 3);
  private static final org.apache.thrift.protocol.TField RESULT_SET_METADATA_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "resultSetMetadata", org.apache.thrift.protocol.TType.STRUCT, (short) 1281);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY =
      new TFetchResultsRespStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY =
      new TFetchResultsRespTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TStatus status; // required
  public boolean hasMoreRows; // optional
  public @org.apache.thrift.annotation.Nullable TRowSet results; // optional
  public @org.apache.thrift.annotation.Nullable TGetResultSetMetadataResp
      resultSetMetadata; // optional

  /**
   * The set of fields this struct contains, along with convenience methods for finding and
   * manipulating them.
   */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short) 1, "status"),
    HAS_MORE_ROWS((short) 2, "hasMoreRows"),
    RESULTS((short) 3, "results"),
    RESULT_SET_METADATA((short) 1281, "resultSetMetadata");

    private static final java.util.Map<java.lang.String, _Fields> byName =
        new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /** Find the _Fields constant that matches fieldId, or null if its not found. */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // HAS_MORE_ROWS
          return HAS_MORE_ROWS;
        case 3: // RESULTS
          return RESULTS;
        case 1281: // RESULT_SET_METADATA
          return RESULT_SET_METADATA;
        default:
          return null;
      }
    }

    /** Find the _Fields constant that matches fieldId, throwing an exception if it is not found. */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null)
        throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /** Find the _Fields constant that matches name, or null if its not found. */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HASMOREROWS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {
    _Fields.HAS_MORE_ROWS, _Fields.RESULTS, _Fields.RESULT_SET_METADATA
  };
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
        new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(
        _Fields.STATUS,
        new org.apache.thrift.meta_data.FieldMetaData(
            "status",
            org.apache.thrift.TFieldRequirementType.REQUIRED,
            new org.apache.thrift.meta_data.StructMetaData(
                org.apache.thrift.protocol.TType.STRUCT, TStatus.class)));
    tmpMap.put(
        _Fields.HAS_MORE_ROWS,
        new org.apache.thrift.meta_data.FieldMetaData(
            "hasMoreRows",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(
                org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(
        _Fields.RESULTS,
        new org.apache.thrift.meta_data.FieldMetaData(
            "results",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.StructMetaData(
                org.apache.thrift.protocol.TType.STRUCT, TRowSet.class)));
    tmpMap.put(
        _Fields.RESULT_SET_METADATA,
        new org.apache.thrift.meta_data.FieldMetaData(
            "resultSetMetadata",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.StructMetaData(
                org.apache.thrift.protocol.TType.STRUCT, TGetResultSetMetadataResp.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
        TFetchResultsResp.class, metaDataMap);
  }

  public TFetchResultsResp() {}

  public TFetchResultsResp(TStatus status) {
    this();
    this.status = status;
  }

  /** Performs a deep copy on <i>other</i>. */
  public TFetchResultsResp(TFetchResultsResp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new TStatus(other.status);
    }
    this.hasMoreRows = other.hasMoreRows;
    if (other.isSetResults()) {
      this.results = new TRowSet(other.results);
    }
    if (other.isSetResultSetMetadata()) {
      this.resultSetMetadata = new TGetResultSetMetadataResp(other.resultSetMetadata);
    }
  }

  @Override
  public TFetchResultsResp deepCopy() {
    return new TFetchResultsResp(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setHasMoreRowsIsSet(false);
    this.hasMoreRows = false;
    this.results = null;
    this.resultSetMetadata = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TStatus getStatus() {
    return this.status;
  }

  public TFetchResultsResp setStatus(@org.apache.thrift.annotation.Nullable TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public boolean isHasMoreRows() {
    return this.hasMoreRows;
  }

  public TFetchResultsResp setHasMoreRows(boolean hasMoreRows) {
    this.hasMoreRows = hasMoreRows;
    setHasMoreRowsIsSet(true);
    return this;
  }

  public void unsetHasMoreRows() {
    __isset_bitfield =
        org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASMOREROWS_ISSET_ID);
  }

  /** Returns true if field hasMoreRows is set (has been assigned a value) and false otherwise */
  public boolean isSetHasMoreRows() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASMOREROWS_ISSET_ID);
  }

  public void setHasMoreRowsIsSet(boolean value) {
    __isset_bitfield =
        org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASMOREROWS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public TRowSet getResults() {
    return this.results;
  }

  public TFetchResultsResp setResults(@org.apache.thrift.annotation.Nullable TRowSet results) {
    this.results = results;
    return this;
  }

  public void unsetResults() {
    this.results = null;
  }

  /** Returns true if field results is set (has been assigned a value) and false otherwise */
  public boolean isSetResults() {
    return this.results != null;
  }

  public void setResultsIsSet(boolean value) {
    if (!value) {
      this.results = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TGetResultSetMetadataResp getResultSetMetadata() {
    return this.resultSetMetadata;
  }

  public TFetchResultsResp setResultSetMetadata(
      @org.apache.thrift.annotation.Nullable TGetResultSetMetadataResp resultSetMetadata) {
    this.resultSetMetadata = resultSetMetadata;
    return this;
  }

  public void unsetResultSetMetadata() {
    this.resultSetMetadata = null;
  }

  /**
   * Returns true if field resultSetMetadata is set (has been assigned a value) and false otherwise
   */
  public boolean isSetResultSetMetadata() {
    return this.resultSetMetadata != null;
  }

  public void setResultSetMetadataIsSet(boolean value) {
    if (!value) {
      this.resultSetMetadata = null;
    }
  }

  @Override
  public void setFieldValue(
      _Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
      case STATUS:
        if (value == null) {
          unsetStatus();
        } else {
          setStatus((TStatus) value);
        }
        break;

      case HAS_MORE_ROWS:
        if (value == null) {
          unsetHasMoreRows();
        } else {
          setHasMoreRows((java.lang.Boolean) value);
        }
        break;

      case RESULTS:
        if (value == null) {
          unsetResults();
        } else {
          setResults((TRowSet) value);
        }
        break;

      case RESULT_SET_METADATA:
        if (value == null) {
          unsetResultSetMetadata();
        } else {
          setResultSetMetadata((TGetResultSetMetadataResp) value);
        }
        break;
    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
      case STATUS:
        return getStatus();

      case HAS_MORE_ROWS:
        return isHasMoreRows();

      case RESULTS:
        return getResults();

      case RESULT_SET_METADATA:
        return getResultSetMetadata();
    }
    throw new java.lang.IllegalStateException();
  }

  /**
   * Returns true if field corresponding to fieldID is set (has been assigned a value) and false
   * otherwise
   */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
      case STATUS:
        return isSetStatus();
      case HAS_MORE_ROWS:
        return isSetHasMoreRows();
      case RESULTS:
        return isSetResults();
      case RESULT_SET_METADATA:
        return isSetResultSetMetadata();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFetchResultsResp) return this.equals((TFetchResultsResp) that);
    return false;
  }

  public boolean equals(TFetchResultsResp that) {
    if (that == null) return false;
    if (this == that) return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status)) return false;
      if (!this.status.equals(that.status)) return false;
    }

    boolean this_present_hasMoreRows = true && this.isSetHasMoreRows();
    boolean that_present_hasMoreRows = true && that.isSetHasMoreRows();
    if (this_present_hasMoreRows || that_present_hasMoreRows) {
      if (!(this_present_hasMoreRows && that_present_hasMoreRows)) return false;
      if (this.hasMoreRows != that.hasMoreRows) return false;
    }

    boolean this_present_results = true && this.isSetResults();
    boolean that_present_results = true && that.isSetResults();
    if (this_present_results || that_present_results) {
      if (!(this_present_results && that_present_results)) return false;
      if (!this.results.equals(that.results)) return false;
    }

    boolean this_present_resultSetMetadata = true && this.isSetResultSetMetadata();
    boolean that_present_resultSetMetadata = true && that.isSetResultSetMetadata();
    if (this_present_resultSetMetadata || that_present_resultSetMetadata) {
      if (!(this_present_resultSetMetadata && that_present_resultSetMetadata)) return false;
      if (!this.resultSetMetadata.equals(that.resultSetMetadata)) return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus()) hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetHasMoreRows()) ? 131071 : 524287);
    if (isSetHasMoreRows()) hashCode = hashCode * 8191 + ((hasMoreRows) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetResults()) ? 131071 : 524287);
    if (isSetResults()) hashCode = hashCode * 8191 + results.hashCode();

    hashCode = hashCode * 8191 + ((isSetResultSetMetadata()) ? 131071 : 524287);
    if (isSetResultSetMetadata()) hashCode = hashCode * 8191 + resultSetMetadata.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFetchResultsResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHasMoreRows(), other.isSetHasMoreRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasMoreRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasMoreRows, other.hasMoreRows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetResults(), other.isSetResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.results, other.results);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison =
        java.lang.Boolean.compare(isSetResultSetMetadata(), other.isSetResultSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultSetMetadata()) {
      lastComparison =
          org.apache.thrift.TBaseHelper.compareTo(this.resultSetMetadata, other.resultSetMetadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot)
      throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFetchResultsResp(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetHasMoreRows()) {
      if (!first) sb.append(", ");
      sb.append("hasMoreRows:");
      sb.append(this.hasMoreRows);
      first = false;
    }
    if (isSetResults()) {
      if (!first) sb.append(", ");
      sb.append("results:");
      if (this.results == null) {
        sb.append("null");
      } else {
        sb.append(this.results);
      }
      first = false;
    }
    if (isSetResultSetMetadata()) {
      if (!first) sb.append(", ");
      sb.append("resultSetMetadata:");
      if (this.resultSetMetadata == null) {
        sb.append("null");
      } else {
        sb.append(this.resultSetMetadata);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException(
          "Required field 'status' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (results != null) {
      results.validate();
    }
    if (resultSetMetadata != null) {
      resultSetMetadata.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(
          new org.apache.thrift.protocol.TCompactProtocol(
              new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in)
      throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and
      // doesn't call the default constructor.
      __isset_bitfield = 0;
      read(
          new org.apache.thrift.protocol.TCompactProtocol(
              new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFetchResultsRespStandardSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TFetchResultsRespStandardScheme getScheme() {
      return new TFetchResultsRespStandardScheme();
    }
  }

  private static class TFetchResultsRespStandardScheme
      extends org.apache.thrift.scheme.StandardScheme<TFetchResultsResp> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TFetchResultsResp struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_MORE_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasMoreRows = iprot.readBool();
              struct.setHasMoreRowsIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.results = new TRowSet();
              struct.results.read(iprot);
              struct.setResultsIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 1281: // RESULT_SET_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resultSetMetadata = new TGetResultSetMetadataResp();
              struct.resultSetMetadata.read(iprot);
              struct.setResultSetMetadataIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TFetchResultsResp struct)
        throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetHasMoreRows()) {
        oprot.writeFieldBegin(HAS_MORE_ROWS_FIELD_DESC);
        oprot.writeBool(struct.hasMoreRows);
        oprot.writeFieldEnd();
      }
      if (struct.results != null) {
        if (struct.isSetResults()) {
          oprot.writeFieldBegin(RESULTS_FIELD_DESC);
          struct.results.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.resultSetMetadata != null) {
        if (struct.isSetResultSetMetadata()) {
          oprot.writeFieldBegin(RESULT_SET_METADATA_FIELD_DESC);
          struct.resultSetMetadata.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }

  private static class TFetchResultsRespTupleSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TFetchResultsRespTupleScheme getScheme() {
      return new TFetchResultsRespTupleScheme();
    }
  }

  private static class TFetchResultsRespTupleScheme
      extends org.apache.thrift.scheme.TupleScheme<TFetchResultsResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFetchResultsResp struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHasMoreRows()) {
        optionals.set(0);
      }
      if (struct.isSetResults()) {
        optionals.set(1);
      }
      if (struct.isSetResultSetMetadata()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetHasMoreRows()) {
        oprot.writeBool(struct.hasMoreRows);
      }
      if (struct.isSetResults()) {
        struct.results.write(oprot);
      }
      if (struct.isSetResultSetMetadata()) {
        struct.resultSetMetadata.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFetchResultsResp struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = new TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.hasMoreRows = iprot.readBool();
        struct.setHasMoreRowsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.results = new TRowSet();
        struct.results.read(iprot);
        struct.setResultsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.resultSetMetadata = new TGetResultSetMetadataResp();
        struct.resultSetMetadata.read(iprot);
        struct.setResultSetMetadataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(
      org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme())
            ? STANDARD_SCHEME_FACTORY
            : TUPLE_SCHEME_FACTORY)
        .getScheme();
  }
}
