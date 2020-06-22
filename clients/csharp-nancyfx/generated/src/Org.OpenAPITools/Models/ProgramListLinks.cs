using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// ProgramListLinks
    /// </summary>
    public sealed class ProgramListLinks:  IEquatable<ProgramListLinks>
    { 
        /// <summary>
        /// Next
        /// </summary>
        public HalLink Next { get; private set; }

        /// <summary>
        /// Prev
        /// </summary>
        public HalLink Prev { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ProgramListLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ProgramListLinks()
        {
        }

        private ProgramListLinks(HalLink Next, HalLink Prev, HalLink Self)
        {
            
            this.Next = Next;
            
            this.Prev = Prev;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of ProgramListLinks.
        /// </summary>
        /// <returns>ProgramListLinksBuilder</returns>
        public static ProgramListLinksBuilder Builder()
        {
            return new ProgramListLinksBuilder();
        }

        /// <summary>
        /// Returns ProgramListLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ProgramListLinksBuilder</returns>
        public ProgramListLinksBuilder With()
        {
            return Builder()
                .Next(Next)
                .Prev(Prev)
                .Self(Self);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ProgramListLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ProgramListLinks.
        /// </summary>
        /// <param name="left">Compared (ProgramListLinks</param>
        /// <param name="right">Compared (ProgramListLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ProgramListLinks left, ProgramListLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ProgramListLinks.
        /// </summary>
        /// <param name="left">Compared (ProgramListLinks</param>
        /// <param name="right">Compared (ProgramListLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ProgramListLinks left, ProgramListLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ProgramListLinks.
        /// </summary>
        public sealed class ProgramListLinksBuilder
        {
            private HalLink _Next;
            private HalLink _Prev;
            private HalLink _Self;

            internal ProgramListLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ProgramListLinks.Next property.
            /// </summary>
            /// <param name="value">Next</param>
            public ProgramListLinksBuilder Next(HalLink value)
            {
                _Next = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProgramListLinks.Prev property.
            /// </summary>
            /// <param name="value">Prev</param>
            public ProgramListLinksBuilder Prev(HalLink value)
            {
                _Prev = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProgramListLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public ProgramListLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ProgramListLinks.
            /// </summary>
            /// <returns>ProgramListLinks</returns>
            public ProgramListLinks Build()
            {
                Validate();
                return new ProgramListLinks(
                    Next: _Next,
                    Prev: _Prev,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}