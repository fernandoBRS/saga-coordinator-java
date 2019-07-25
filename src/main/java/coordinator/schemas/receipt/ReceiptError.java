/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package coordinator.schemas.receipt;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ReceiptError extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1862658821759735276L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReceiptError\",\"namespace\":\"coordinator.schemas.receipt\",\"fields\":[{\"name\":\"transactionId\",\"type\":\"string\"},{\"name\":\"correlationId\",\"type\":\"string\"},{\"name\":\"message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ReceiptError> ENCODER =
      new BinaryMessageEncoder<ReceiptError>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ReceiptError> DECODER =
      new BinaryMessageDecoder<ReceiptError>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ReceiptError> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ReceiptError> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ReceiptError>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ReceiptError to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ReceiptError from a ByteBuffer. */
  public static ReceiptError fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence transactionId;
  @Deprecated public java.lang.CharSequence correlationId;
  @Deprecated public java.lang.CharSequence message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ReceiptError() {}

  /**
   * All-args constructor.
   * @param transactionId The new value for transactionId
   * @param correlationId The new value for correlationId
   * @param message The new value for message
   */
  public ReceiptError(java.lang.CharSequence transactionId, java.lang.CharSequence correlationId, java.lang.CharSequence message) {
    this.transactionId = transactionId;
    this.correlationId = correlationId;
    this.message = message;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return transactionId;
    case 1: return correlationId;
    case 2: return message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: transactionId = (java.lang.CharSequence)value$; break;
    case 1: correlationId = (java.lang.CharSequence)value$; break;
    case 2: message = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'transactionId' field.
   * @return The value of the 'transactionId' field.
   */
  public java.lang.CharSequence getTransactionId() {
    return transactionId;
  }

  /**
   * Sets the value of the 'transactionId' field.
   * @param value the value to set.
   */
  public void setTransactionId(java.lang.CharSequence value) {
    this.transactionId = value;
  }

  /**
   * Gets the value of the 'correlationId' field.
   * @return The value of the 'correlationId' field.
   */
  public java.lang.CharSequence getCorrelationId() {
    return correlationId;
  }

  /**
   * Sets the value of the 'correlationId' field.
   * @param value the value to set.
   */
  public void setCorrelationId(java.lang.CharSequence value) {
    this.correlationId = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }

  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Creates a new ReceiptError RecordBuilder.
   * @return A new ReceiptError RecordBuilder
   */
  public static coordinator.schemas.receipt.ReceiptError.Builder newBuilder() {
    return new coordinator.schemas.receipt.ReceiptError.Builder();
  }

  /**
   * Creates a new ReceiptError RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ReceiptError RecordBuilder
   */
  public static coordinator.schemas.receipt.ReceiptError.Builder newBuilder(coordinator.schemas.receipt.ReceiptError.Builder other) {
    return new coordinator.schemas.receipt.ReceiptError.Builder(other);
  }

  /**
   * Creates a new ReceiptError RecordBuilder by copying an existing ReceiptError instance.
   * @param other The existing instance to copy.
   * @return A new ReceiptError RecordBuilder
   */
  public static coordinator.schemas.receipt.ReceiptError.Builder newBuilder(coordinator.schemas.receipt.ReceiptError other) {
    return new coordinator.schemas.receipt.ReceiptError.Builder(other);
  }

  /**
   * RecordBuilder for ReceiptError instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReceiptError>
    implements org.apache.avro.data.RecordBuilder<ReceiptError> {

    private java.lang.CharSequence transactionId;
    private java.lang.CharSequence correlationId;
    private java.lang.CharSequence message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(coordinator.schemas.receipt.ReceiptError.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.transactionId)) {
        this.transactionId = data().deepCopy(fields()[0].schema(), other.transactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[1].schema(), other.correlationId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ReceiptError instance
     * @param other The existing instance to copy.
     */
    private Builder(coordinator.schemas.receipt.ReceiptError other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.transactionId)) {
        this.transactionId = data().deepCopy(fields()[0].schema(), other.transactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[1].schema(), other.correlationId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'transactionId' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionId() {
      return transactionId;
    }

    /**
      * Sets the value of the 'transactionId' field.
      * @param value The value of 'transactionId'.
      * @return This builder.
      */
    public coordinator.schemas.receipt.ReceiptError.Builder setTransactionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.transactionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'transactionId' field has been set.
      * @return True if the 'transactionId' field has been set, false otherwise.
      */
    public boolean hasTransactionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'transactionId' field.
      * @return This builder.
      */
    public coordinator.schemas.receipt.ReceiptError.Builder clearTransactionId() {
      transactionId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'correlationId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCorrelationId() {
      return correlationId;
    }

    /**
      * Sets the value of the 'correlationId' field.
      * @param value The value of 'correlationId'.
      * @return This builder.
      */
    public coordinator.schemas.receipt.ReceiptError.Builder setCorrelationId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.correlationId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'correlationId' field has been set.
      * @return True if the 'correlationId' field has been set, false otherwise.
      */
    public boolean hasCorrelationId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'correlationId' field.
      * @return This builder.
      */
    public coordinator.schemas.receipt.ReceiptError.Builder clearCorrelationId() {
      correlationId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }

    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public coordinator.schemas.receipt.ReceiptError.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.message = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public coordinator.schemas.receipt.ReceiptError.Builder clearMessage() {
      message = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ReceiptError build() {
      try {
        ReceiptError record = new ReceiptError();
        record.transactionId = fieldSetFlags()[0] ? this.transactionId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.correlationId = fieldSetFlags()[1] ? this.correlationId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.message = fieldSetFlags()[2] ? this.message : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ReceiptError>
    WRITER$ = (org.apache.avro.io.DatumWriter<ReceiptError>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ReceiptError>
    READER$ = (org.apache.avro.io.DatumReader<ReceiptError>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
