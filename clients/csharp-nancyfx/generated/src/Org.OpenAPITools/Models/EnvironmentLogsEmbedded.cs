using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// EnvironmentLogsEmbedded
    /// </summary>
    public sealed class EnvironmentLogsEmbedded:  IEquatable<EnvironmentLogsEmbedded>
    { 
        /// <summary>
        /// Links to logs
        /// </summary>
        public List<EnvironmentLog> Downloads { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EnvironmentLogsEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EnvironmentLogsEmbedded()
        {
        }

        private EnvironmentLogsEmbedded(List<EnvironmentLog> Downloads)
        {
            
            this.Downloads = Downloads;
            
        }

        /// <summary>
        /// Returns builder of EnvironmentLogsEmbedded.
        /// </summary>
        /// <returns>EnvironmentLogsEmbeddedBuilder</returns>
        public static EnvironmentLogsEmbeddedBuilder Builder()
        {
            return new EnvironmentLogsEmbeddedBuilder();
        }

        /// <summary>
        /// Returns EnvironmentLogsEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentLogsEmbeddedBuilder</returns>
        public EnvironmentLogsEmbeddedBuilder With()
        {
            return Builder()
                .Downloads(Downloads);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EnvironmentLogsEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EnvironmentLogsEmbedded.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLogsEmbedded</param>
        /// <param name="right">Compared (EnvironmentLogsEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EnvironmentLogsEmbedded left, EnvironmentLogsEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EnvironmentLogsEmbedded.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLogsEmbedded</param>
        /// <param name="right">Compared (EnvironmentLogsEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EnvironmentLogsEmbedded left, EnvironmentLogsEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EnvironmentLogsEmbedded.
        /// </summary>
        public sealed class EnvironmentLogsEmbeddedBuilder
        {
            private List<EnvironmentLog> _Downloads;

            internal EnvironmentLogsEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EnvironmentLogsEmbedded.Downloads property.
            /// </summary>
            /// <param name="value">Links to logs</param>
            public EnvironmentLogsEmbeddedBuilder Downloads(List<EnvironmentLog> value)
            {
                _Downloads = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EnvironmentLogsEmbedded.
            /// </summary>
            /// <returns>EnvironmentLogsEmbedded</returns>
            public EnvironmentLogsEmbedded Build()
            {
                Validate();
                return new EnvironmentLogsEmbedded(
                    Downloads: _Downloads
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}