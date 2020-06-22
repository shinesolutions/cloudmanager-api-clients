using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// EnvironmentListEmbedded
    /// </summary>
    public sealed class EnvironmentListEmbedded:  IEquatable<EnvironmentListEmbedded>
    { 
        /// <summary>
        /// Environments
        /// </summary>
        public List<Environment> Environments { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EnvironmentListEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EnvironmentListEmbedded()
        {
        }

        private EnvironmentListEmbedded(List<Environment> Environments)
        {
            
            this.Environments = Environments;
            
        }

        /// <summary>
        /// Returns builder of EnvironmentListEmbedded.
        /// </summary>
        /// <returns>EnvironmentListEmbeddedBuilder</returns>
        public static EnvironmentListEmbeddedBuilder Builder()
        {
            return new EnvironmentListEmbeddedBuilder();
        }

        /// <summary>
        /// Returns EnvironmentListEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentListEmbeddedBuilder</returns>
        public EnvironmentListEmbeddedBuilder With()
        {
            return Builder()
                .Environments(Environments);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EnvironmentListEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EnvironmentListEmbedded.
        /// </summary>
        /// <param name="left">Compared (EnvironmentListEmbedded</param>
        /// <param name="right">Compared (EnvironmentListEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EnvironmentListEmbedded left, EnvironmentListEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EnvironmentListEmbedded.
        /// </summary>
        /// <param name="left">Compared (EnvironmentListEmbedded</param>
        /// <param name="right">Compared (EnvironmentListEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EnvironmentListEmbedded left, EnvironmentListEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EnvironmentListEmbedded.
        /// </summary>
        public sealed class EnvironmentListEmbeddedBuilder
        {
            private List<Environment> _Environments;

            internal EnvironmentListEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EnvironmentListEmbedded.Environments property.
            /// </summary>
            /// <param name="value">Environments</param>
            public EnvironmentListEmbeddedBuilder Environments(List<Environment> value)
            {
                _Environments = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EnvironmentListEmbedded.
            /// </summary>
            /// <returns>EnvironmentListEmbedded</returns>
            public EnvironmentListEmbedded Build()
            {
                Validate();
                return new EnvironmentListEmbedded(
                    Environments: _Environments
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}