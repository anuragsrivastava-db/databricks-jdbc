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
public class TSparkParameterValueArg
    implements org.apache.thrift.TBase<TSparkParameterValueArg, TSparkParameterValueArg._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<TSparkParameterValueArg> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
      new org.apache.thrift.protocol.TStruct("TSparkParameterValueArg");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "type", org.apache.thrift.protocol.TType.STRING, (short) 1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "value", org.apache.thrift.protocol.TType.STRING, (short) 2);
  private static final org.apache.thrift.protocol.TField ARGUMENTS_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "arguments", org.apache.thrift.protocol.TType.LIST, (short) 3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY =
      new TSparkParameterValueArgStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY =
      new TSparkParameterValueArgTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String type; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String value; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TSparkParameterValueArg>
      arguments; // optional

  /**
   * The set of fields this struct contains, along with convenience methods for finding and
   * manipulating them.
   */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short) 1, "type"),
    VALUE((short) 2, "value"),
    ARGUMENTS((short) 3, "arguments");

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
        case 1: // TYPE
          return TYPE;
        case 2: // VALUE
          return VALUE;
        case 3: // ARGUMENTS
          return ARGUMENTS;
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
  private static final _Fields optionals[] = {_Fields.TYPE, _Fields.VALUE, _Fields.ARGUMENTS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
        new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(
        _Fields.TYPE,
        new org.apache.thrift.meta_data.FieldMetaData(
            "type",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(
                org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(
        _Fields.VALUE,
        new org.apache.thrift.meta_data.FieldMetaData(
            "value",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.FieldValueMetaData(
                org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(
        _Fields.ARGUMENTS,
        new org.apache.thrift.meta_data.FieldMetaData(
            "arguments",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.ListMetaData(
                org.apache.thrift.protocol.TType.LIST,
                new org.apache.thrift.meta_data.StructMetaData(
                    org.apache.thrift.protocol.TType.STRUCT, TSparkParameterValueArg.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
        TSparkParameterValueArg.class, metaDataMap);
  }

  public TSparkParameterValueArg() {}

  /** Performs a deep copy on <i>other</i>. */
  public TSparkParameterValueArg(TSparkParameterValueArg other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
    if (other.isSetArguments()) {
      java.util.List<TSparkParameterValueArg> __this__arguments =
          new java.util.ArrayList<TSparkParameterValueArg>(other.arguments.size());
      for (TSparkParameterValueArg other_element : other.arguments) {
        __this__arguments.add(new TSparkParameterValueArg(other_element));
      }
      this.arguments = __this__arguments;
    }
  }

  @Override
  public TSparkParameterValueArg deepCopy() {
    return new TSparkParameterValueArg(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.value = null;
    this.arguments = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getType() {
    return this.type;
  }

  public TSparkParameterValueArg setType(
      @org.apache.thrift.annotation.Nullable java.lang.String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValue() {
    return this.value;
  }

  public TSparkParameterValueArg setValue(
      @org.apache.thrift.annotation.Nullable java.lang.String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public int getArgumentsSize() {
    return (this.arguments == null) ? 0 : this.arguments.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TSparkParameterValueArg> getArgumentsIterator() {
    return (this.arguments == null) ? null : this.arguments.iterator();
  }

  public void addToArguments(TSparkParameterValueArg elem) {
    if (this.arguments == null) {
      this.arguments = new java.util.ArrayList<TSparkParameterValueArg>();
    }
    this.arguments.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TSparkParameterValueArg> getArguments() {
    return this.arguments;
  }

  public TSparkParameterValueArg setArguments(
      @org.apache.thrift.annotation.Nullable java.util.List<TSparkParameterValueArg> arguments) {
    this.arguments = arguments;
    return this;
  }

  public void unsetArguments() {
    this.arguments = null;
  }

  /** Returns true if field arguments is set (has been assigned a value) and false otherwise */
  public boolean isSetArguments() {
    return this.arguments != null;
  }

  public void setArgumentsIsSet(boolean value) {
    if (!value) {
      this.arguments = null;
    }
  }

  @Override
  public void setFieldValue(
      _Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
      case TYPE:
        if (value == null) {
          unsetType();
        } else {
          setType((java.lang.String) value);
        }
        break;

      case VALUE:
        if (value == null) {
          unsetValue();
        } else {
          setValue((java.lang.String) value);
        }
        break;

      case ARGUMENTS:
        if (value == null) {
          unsetArguments();
        } else {
          setArguments((java.util.List<TSparkParameterValueArg>) value);
        }
        break;
    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
      case TYPE:
        return getType();

      case VALUE:
        return getValue();

      case ARGUMENTS:
        return getArguments();
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
      case TYPE:
        return isSetType();
      case VALUE:
        return isSetValue();
      case ARGUMENTS:
        return isSetArguments();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSparkParameterValueArg) return this.equals((TSparkParameterValueArg) that);
    return false;
  }

  public boolean equals(TSparkParameterValueArg that) {
    if (that == null) return false;
    if (this == that) return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type)) return false;
      if (!this.type.equals(that.type)) return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value)) return false;
      if (!this.value.equals(that.value)) return false;
    }

    boolean this_present_arguments = true && this.isSetArguments();
    boolean that_present_arguments = true && that.isSetArguments();
    if (this_present_arguments || that_present_arguments) {
      if (!(this_present_arguments && that_present_arguments)) return false;
      if (!this.arguments.equals(that.arguments)) return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType()) hashCode = hashCode * 8191 + type.hashCode();

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue()) hashCode = hashCode * 8191 + value.hashCode();

    hashCode = hashCode * 8191 + ((isSetArguments()) ? 131071 : 524287);
    if (isSetArguments()) hashCode = hashCode * 8191 + arguments.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TSparkParameterValueArg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetValue(), other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetArguments(), other.isSetArguments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArguments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arguments, other.arguments);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSparkParameterValueArg(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        sb.append(this.value);
      }
      first = false;
    }
    if (isSetArguments()) {
      if (!first) sb.append(", ");
      sb.append("arguments:");
      if (this.arguments == null) {
        sb.append("null");
      } else {
        sb.append(this.arguments);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(
          new org.apache.thrift.protocol.TCompactProtocol(
              new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSparkParameterValueArgStandardSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSparkParameterValueArgStandardScheme getScheme() {
      return new TSparkParameterValueArgStandardScheme();
    }
  }

  private static class TSparkParameterValueArgStandardScheme
      extends org.apache.thrift.scheme.StandardScheme<TSparkParameterValueArg> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TSparkParameterValueArg struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARGUMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list232 = iprot.readListBegin();
                struct.arguments = new java.util.ArrayList<TSparkParameterValueArg>(_list232.size);
                @org.apache.thrift.annotation.Nullable TSparkParameterValueArg _elem233;
                for (int _i234 = 0; _i234 < _list232.size; ++_i234) {
                  _elem233 = new TSparkParameterValueArg();
                  _elem233.read(iprot);
                  struct.arguments.add(_elem233);
                }
                iprot.readListEnd();
              }
              struct.setArgumentsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TSparkParameterValueArg struct)
        throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeString(struct.type);
          oprot.writeFieldEnd();
        }
      }
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          oprot.writeString(struct.value);
          oprot.writeFieldEnd();
        }
      }
      if (struct.arguments != null) {
        if (struct.isSetArguments()) {
          oprot.writeFieldBegin(ARGUMENTS_FIELD_DESC);
          {
            oprot.writeListBegin(
                new org.apache.thrift.protocol.TList(
                    org.apache.thrift.protocol.TType.STRUCT, struct.arguments.size()));
            for (TSparkParameterValueArg _iter235 : struct.arguments) {
              _iter235.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }

  private static class TSparkParameterValueArgTupleSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSparkParameterValueArgTupleScheme getScheme() {
      return new TSparkParameterValueArgTupleScheme();
    }
  }

  private static class TSparkParameterValueArgTupleScheme
      extends org.apache.thrift.scheme.TupleScheme<TSparkParameterValueArg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSparkParameterValueArg struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetValue()) {
        optionals.set(1);
      }
      if (struct.isSetArguments()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetValue()) {
        oprot.writeString(struct.value);
      }
      if (struct.isSetArguments()) {
        {
          oprot.writeI32(struct.arguments.size());
          for (TSparkParameterValueArg _iter236 : struct.arguments) {
            _iter236.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSparkParameterValueArg struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.value = iprot.readString();
        struct.setValueIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list237 =
              iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.arguments = new java.util.ArrayList<TSparkParameterValueArg>(_list237.size);
          @org.apache.thrift.annotation.Nullable TSparkParameterValueArg _elem238;
          for (int _i239 = 0; _i239 < _list237.size; ++_i239) {
            _elem238 = new TSparkParameterValueArg();
            _elem238.read(iprot);
            struct.arguments.add(_elem238);
          }
        }
        struct.setArgumentsIsSet(true);
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
