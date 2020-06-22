using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// VariableListEmbedded
    /// </summary>
    public sealed class VariableListEmbedded:  IEquatable<VariableListEmbedded>
    { 
        /// <summary>
        /// Variables set on environment
        /// </summary>
        public List<Variable> Variables { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VariableListEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VariableListEmbedded()
        {
        }

        private VariableListEmbedded(List<Variable> Variables)
        {
            
            this.Variables = Variables;
            
        }

        /// <summary>
        /// Returns builder of VariableListEmbedded.
        /// </summary>
        /// <returns>VariableListEmbeddedBuilder</returns>
        public static VariableListEmbeddedBuilder Builder()
        {
            return new VariableListEmbeddedBuilder();
        }

        /// <summary>
        /// Returns VariableListEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VariableListEmbeddedBuilder</returns>
        public VariableListEmbeddedBuilder With()
        {
            return Builder()
                .Variables(Variables);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VariableListEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VariableListEmbedded.
        /// </summary>
        /// <param name="left">Compared (VariableListEmbedded</param>
        /// <param name="right">Compared (VariableListEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VariableListEmbedded left, VariableListEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VariableListEmbedded.
        /// </summary>
        /// <param name="left">Compared (VariableListEmbedded</param>
        /// <param name="right">Compared (VariableListEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VariableListEmbedded left, VariableListEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VariableListEmbedded.
        /// </summary>
        public sealed class VariableListEmbeddedBuilder
        {
            private List<Variable> _Variables;

            internal VariableListEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VariableListEmbedded.Variables property.
            /// </summary>
            /// <param name="value">Variables set on environment</param>
            public VariableListEmbeddedBuilder Variables(List<Variable> value)
            {
                _Variables = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VariableListEmbedded.
            /// </summary>
            /// <returns>VariableListEmbedded</returns>
            public VariableListEmbedded Build()
            {
                Validate();
                return new VariableListEmbedded(
                    Variables: _Variables
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}