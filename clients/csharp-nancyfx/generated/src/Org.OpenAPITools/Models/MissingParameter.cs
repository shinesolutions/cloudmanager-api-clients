using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// MissingParameter
    /// </summary>
    public sealed class MissingParameter:  IEquatable<MissingParameter>
    { 
        /// <summary>
        /// Name of the missing parameter.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Type of the missing parameter.
        /// </summary>
        public string Type { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MissingParameter.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MissingParameter()
        {
        }

        private MissingParameter(string Name, string Type)
        {
            
            this.Name = Name;
            
            this.Type = Type;
            
        }

        /// <summary>
        /// Returns builder of MissingParameter.
        /// </summary>
        /// <returns>MissingParameterBuilder</returns>
        public static MissingParameterBuilder Builder()
        {
            return new MissingParameterBuilder();
        }

        /// <summary>
        /// Returns MissingParameterBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MissingParameterBuilder</returns>
        public MissingParameterBuilder With()
        {
            return Builder()
                .Name(Name)
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

        public bool Equals(MissingParameter other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MissingParameter.
        /// </summary>
        /// <param name="left">Compared (MissingParameter</param>
        /// <param name="right">Compared (MissingParameter</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MissingParameter left, MissingParameter right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MissingParameter.
        /// </summary>
        /// <param name="left">Compared (MissingParameter</param>
        /// <param name="right">Compared (MissingParameter</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MissingParameter left, MissingParameter right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MissingParameter.
        /// </summary>
        public sealed class MissingParameterBuilder
        {
            private string _Name;
            private string _Type;

            internal MissingParameterBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MissingParameter.Name property.
            /// </summary>
            /// <param name="value">Name of the missing parameter.</param>
            public MissingParameterBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for MissingParameter.Type property.
            /// </summary>
            /// <param name="value">Type of the missing parameter.</param>
            public MissingParameterBuilder Type(string value)
            {
                _Type = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MissingParameter.
            /// </summary>
            /// <returns>MissingParameter</returns>
            public MissingParameter Build()
            {
                Validate();
                return new MissingParameter(
                    Name: _Name,
                    Type: _Type
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}