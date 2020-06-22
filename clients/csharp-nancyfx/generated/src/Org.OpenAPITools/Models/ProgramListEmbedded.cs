using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// ProgramListEmbedded
    /// </summary>
    public sealed class ProgramListEmbedded:  IEquatable<ProgramListEmbedded>
    { 
        /// <summary>
        /// Programs
        /// </summary>
        public List<EmbeddedProgram> Programs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ProgramListEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ProgramListEmbedded()
        {
        }

        private ProgramListEmbedded(List<EmbeddedProgram> Programs)
        {
            
            this.Programs = Programs;
            
        }

        /// <summary>
        /// Returns builder of ProgramListEmbedded.
        /// </summary>
        /// <returns>ProgramListEmbeddedBuilder</returns>
        public static ProgramListEmbeddedBuilder Builder()
        {
            return new ProgramListEmbeddedBuilder();
        }

        /// <summary>
        /// Returns ProgramListEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ProgramListEmbeddedBuilder</returns>
        public ProgramListEmbeddedBuilder With()
        {
            return Builder()
                .Programs(Programs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ProgramListEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ProgramListEmbedded.
        /// </summary>
        /// <param name="left">Compared (ProgramListEmbedded</param>
        /// <param name="right">Compared (ProgramListEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ProgramListEmbedded left, ProgramListEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ProgramListEmbedded.
        /// </summary>
        /// <param name="left">Compared (ProgramListEmbedded</param>
        /// <param name="right">Compared (ProgramListEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ProgramListEmbedded left, ProgramListEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ProgramListEmbedded.
        /// </summary>
        public sealed class ProgramListEmbeddedBuilder
        {
            private List<EmbeddedProgram> _Programs;

            internal ProgramListEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ProgramListEmbedded.Programs property.
            /// </summary>
            /// <param name="value">Programs</param>
            public ProgramListEmbeddedBuilder Programs(List<EmbeddedProgram> value)
            {
                _Programs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ProgramListEmbedded.
            /// </summary>
            /// <returns>ProgramListEmbedded</returns>
            public ProgramListEmbedded Build()
            {
                Validate();
                return new ProgramListEmbedded(
                    Programs: _Programs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}