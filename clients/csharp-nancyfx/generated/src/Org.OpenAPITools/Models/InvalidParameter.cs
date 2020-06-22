using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// InvalidParameter
    /// </summary>
    public sealed class InvalidParameter:  IEquatable<InvalidParameter>
    { 
        /// <summary>
        /// Name of the invalid parameter.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Reason of why the parameter&#39;s value is not accepted.
        /// </summary>
        public string Reason { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InvalidParameter.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InvalidParameter()
        {
        }

        private InvalidParameter(string Name, string Reason)
        {
            
            this.Name = Name;
            
            this.Reason = Reason;
            
        }

        /// <summary>
        /// Returns builder of InvalidParameter.
        /// </summary>
        /// <returns>InvalidParameterBuilder</returns>
        public static InvalidParameterBuilder Builder()
        {
            return new InvalidParameterBuilder();
        }

        /// <summary>
        /// Returns InvalidParameterBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InvalidParameterBuilder</returns>
        public InvalidParameterBuilder With()
        {
            return Builder()
                .Name(Name)
                .Reason(Reason);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InvalidParameter other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InvalidParameter.
        /// </summary>
        /// <param name="left">Compared (InvalidParameter</param>
        /// <param name="right">Compared (InvalidParameter</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InvalidParameter left, InvalidParameter right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InvalidParameter.
        /// </summary>
        /// <param name="left">Compared (InvalidParameter</param>
        /// <param name="right">Compared (InvalidParameter</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InvalidParameter left, InvalidParameter right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InvalidParameter.
        /// </summary>
        public sealed class InvalidParameterBuilder
        {
            private string _Name;
            private string _Reason;

            internal InvalidParameterBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InvalidParameter.Name property.
            /// </summary>
            /// <param name="value">Name of the invalid parameter.</param>
            public InvalidParameterBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for InvalidParameter.Reason property.
            /// </summary>
            /// <param name="value">Reason of why the parameter&#39;s value is not accepted.</param>
            public InvalidParameterBuilder Reason(string value)
            {
                _Reason = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InvalidParameter.
            /// </summary>
            /// <returns>InvalidParameter</returns>
            public InvalidParameter Build()
            {
                Validate();
                return new InvalidParameter(
                    Name: _Name,
                    Reason: _Reason
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}