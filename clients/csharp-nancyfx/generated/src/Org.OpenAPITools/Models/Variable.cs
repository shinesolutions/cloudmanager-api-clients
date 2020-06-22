using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// A named value than can be set on an Environment
    /// </summary>
    public sealed class Variable:  IEquatable<Variable>
    { 
        /// <summary>
        /// Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Value of the variable. Read-Write for non-secrets, write-only for secrets.
        /// </summary>
        public string Value { get; private set; }

        /// <summary>
        /// Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.
        /// </summary>
        public TypeEnum? Type { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Variable.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Variable()
        {
        }

        private Variable(string Name, string Value, TypeEnum? Type)
        {
            
            this.Name = Name;
            
            this.Value = Value;
            
            this.Type = Type;
            
        }

        /// <summary>
        /// Returns builder of Variable.
        /// </summary>
        /// <returns>VariableBuilder</returns>
        public static VariableBuilder Builder()
        {
            return new VariableBuilder();
        }

        /// <summary>
        /// Returns VariableBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VariableBuilder</returns>
        public VariableBuilder With()
        {
            return Builder()
                .Name(Name)
                .Value(Value)
                .Type(Type);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Variable other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Variable.
        /// </summary>
        /// <param name="left">Compared (Variable</param>
        /// <param name="right">Compared (Variable</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Variable left, Variable right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Variable.
        /// </summary>
        /// <param name="left">Compared (Variable</param>
        /// <param name="right">Compared (Variable</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Variable left, Variable right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Variable.
        /// </summary>
        public sealed class VariableBuilder
        {
            private string _Name;
            private string _Value;
            private TypeEnum? _Type;

            internal VariableBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Variable.Name property.
            /// </summary>
            /// <param name="value">Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.</param>
            public VariableBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Variable.Value property.
            /// </summary>
            /// <param name="value">Value of the variable. Read-Write for non-secrets, write-only for secrets.</param>
            public VariableBuilder Value(string value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for Variable.Type property.
            /// </summary>
            /// <param name="value">Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.</param>
            public VariableBuilder Type(TypeEnum? value)
            {
                _Type = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Variable.
            /// </summary>
            /// <returns>Variable</returns>
            public Variable Build()
            {
                Validate();
                return new Variable(
                    Name: _Name,
                    Value: _Value,
                    Type: _Type
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum TypeEnum { String, SecretString };
    }
}